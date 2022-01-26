trait Shape
    case class Circle(radius: Double) extends Shape
    case class Square(length: Double) extends Shape
    case class Rectangle(h: Double, w: Double) extends Shape

object Shape:
    def area(shape: Shape): Double =
        shape match
            case Circle(r) => r * r * Math.PI
            case Square(l) => l * l
            case Rectangle(h, w) => h * w