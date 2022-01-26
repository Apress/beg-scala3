trait OShape:
    def area: Double

class OCircle(radius: Double) extends OShape:
    def area = radius * radius * Math.PI

class OSquare(length: Double) extends OShape:
    def area = length * length

class ORectangle(h: Double, w: Double) extends OShape:
    def area = h * w