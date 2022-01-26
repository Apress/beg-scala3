class Cat(val name: String) extends Mammal with HasLegs with KnowsName with IgnoresName:
  def ignoreName(when: String) =
    when match
      case "Dinner" => false
      case _ => true

  def bodyTemperature: Double = 99.5