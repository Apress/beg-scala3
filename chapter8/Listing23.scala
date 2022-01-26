import scala.language.implicitConversions

case class Euros(amount: Double):
    override def toString = f"$$$amount%.2f"

given Conversion[Double,Euros] = d => Euros(d)

given_Conversion_Double_Euros(3)
