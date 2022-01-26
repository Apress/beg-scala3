class Light(val bulb: Int, val status: Boolean):
    private def isWorking() : Boolean = if bulb >0 then true else false
    def turnOn() : Unit = if this.isWorking() then print("Turn on the lights") else print("It's impossible to turn on the lights")

var light = Light(75, true)
light.turnOn()