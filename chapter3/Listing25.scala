class Light(val bulb: Int, val status: Boolean):
    override def equals(that: Any): Boolean = 
        that match 
            case that: Light => that.isInstanceOf[Light] && this.bulb == that.bulb && this.status == that.status 
            case _ => false

val lightOne = Light(75, true)
val lightTwo = Light(75, true)
lightOne == lightTwo   