val areaOfRectangle :(Int, Int) => Int = new Function2[Int, Int, Int]{
    def apply(width:Int, height:Int):Int = width*height
}

areaOfRectangle(5,3)