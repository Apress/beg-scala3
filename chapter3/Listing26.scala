class Light(val bulb: Int, val status: Boolean):
    protected def isWorking() : Boolean = if bulb >0 then true else false
    def turnOn() : Unit = if this.isWorking() then print("Turn on the back lights") else print("It's impossible to turn on the lights")

class BackLight(bulb: Int, status: Boolean) extends Light(bulb, status)
val backLight = BackLight(75, true)
backLight.turnOn()  