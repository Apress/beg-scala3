trait AbstractLight:
    def turnOn() : Unit
class Light extends AbstractLight:
    override def turnOn() = print("Turn on the lights")