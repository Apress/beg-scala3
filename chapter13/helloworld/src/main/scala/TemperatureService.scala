class TemperatureService(val calculator: TemperatureCalculator) {

  def calculateTemperature(temperature: Float) =
    calculator.fromCelsiusToFahrenheit(temperature)
}
