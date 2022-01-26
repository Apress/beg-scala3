trait OShape:
    def area: Double

class OCircle(radius: Double) extends OShape:
    def area = radius * radius * Math.PI
    def getRadius = radius

class OSquare(length: Double) extends OShape:
    def area = length * length
    def getLength = length

class ORectangle(h: Double, w: Double) extends OShape:
    def area      = h * w
    def getHeight = h
    def getWidth  = w