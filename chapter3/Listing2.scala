class Light:
    private val bulb = 75 // private restrict the access
    def turnOn() = print("Turn on the lights of " + bulb)

val light = Light()
light.bulb