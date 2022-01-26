class Light(val bulb: Int, val status: Boolean):
    override def toString() : String = s"The bulb has a potency of $bulb and the status is $status"

val light = Light(75, true)
println(light)
