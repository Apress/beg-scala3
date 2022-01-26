import org.scalatest.flatspec.AnyFlatSpec
import org.scalamock.scalatest.MockFactory

class TemperatureServiceTests extends AnyFlatSpec with MockFactory {
  
  it should "return a temperature of 32.0 Fahrenheit when the Celsius is 0" in {
    val mockTemperatureCalculator = mock[TemperatureCalculator]
    val calculatorService = TemperatureService(mockTemperatureCalculator)
    (calculatorService.fromCelsiusToFahrenheit_).when(0).returns(32.0)
    
    val result = calculatorService.fromCelsiusToFahrenheit(0)
    
    assert(result == 32.0)
  }
  
}