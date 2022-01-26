trait OCarVisitor:
    def visit(wheel: OWheel): Unit
    def visit(engine: OEngine): Unit
    def visit(body: OBody): Unit
    def visit(car: OCar): Unit

trait OCarElement:
    def accept(visitor: OCarVisitor): Unit

class OWheel(val name: String) extends OCarElement:
    def accept(visitor: OCarVisitor) = visitor.visit(this)

class OEngine extends OCarElement:
    def accept(visitor: OCarVisitor) = visitor.visit(this)

class OBody extends OCarElement:
    def accept(visitor: OCarVisitor) = visitor.visit(this)

class OCar extends OCarElement:
    val elements = List(new OEngine, new OBody, new OWheel("FR"),
      new OWheel("FL"), new OWheel("RR"), new OWheel("RL"))

    def accept(visitor: OCarVisitor) = (this :: elements).foreach(_.accept(visitor))

trait CarElement:
    case class Wheel(name: String) extends CarElement
    case class Engine() extends CarElement
    case class Body() extends CarElement
    case class Car(elements: List[CarElement]) extends CarElement


def doSomething(in: CarElement): Unit =
    in match
        case Wheel(name) =>
        case Engine() =>
        case Body() =>
        case Car(e) => e.foreach(doSomething)