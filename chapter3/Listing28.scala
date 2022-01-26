class BackLight(bulb: Int, status: Boolean) extends Light(bulb, status):
    override def turnOn(): Unit =
        super.turnOn()
        if this.isWorking() then print("Turn on the back lights") else print("It's impossible to turn on the back lights")

val backLight = BackLight(75, true)
backLight.turnOn()