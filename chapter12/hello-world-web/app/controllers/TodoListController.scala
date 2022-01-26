package controllers

import javax.inject.{Inject, Singleton}
import models.TodoListItem
import play.api.libs.json._
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Results}
import scala.collection.mutable

@Singleton
class TodoListController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  private val todoList = new mutable.ListBuffer[TodoListItem]()
  todoList += TodoListItem(1, "test", true)

  def getById(id: Long) = Action { request =>
    val foundItem = todoList.find(_.id == id)
    foundItem match {
      case Some(foundItem) => Ok(Json.toJson(foundItem))
      case None => NotFound
    }
  }
}
