import scala.beans.BeanProperty

class Book(@BeanProperty var isbn:Int, @BeanProperty var title:String)