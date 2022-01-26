class Light:
    def turnOn() = print("Turn on the lights") 
    def turnOn(message : String) = print(message)

class BackLight() extends Light:
    override def turnOn() = print("Turn on the backlights")
    def turnOnStop() = print("Stop lights")
