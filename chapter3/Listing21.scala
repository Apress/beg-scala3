class Light(val bulb: Int, val status: Boolean):
    private def isWorking() : Boolean = if bulb >0 then true else false

val light = Light(75, true)
println(light.isWorking())