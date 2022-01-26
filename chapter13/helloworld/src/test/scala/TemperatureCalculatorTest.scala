import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class TemperatureCalculatorTests extends AnyFlatSpec {

  val calculator = TemperatureCalculator()

  it should "return a temperature of 32.0 Fahrenheit when the Celsius is 0" in {
    val result = calculator.fromCelsiusToFahrenheit(0)

    result shouldBe 32.0
  }

  it should "return a temperature of 68 Fahrenheit when the Celsius is 20" in {
    val result = calculator.fromCelsiusToFahrenheit(20)

    result shouldBe 68.0
  }
  
}