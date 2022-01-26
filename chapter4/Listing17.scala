def operation(functionparam:(Int, Int) => Int) =  println(functionparam(4,4))
val add = (x: Int, y:Int) => { x + y }
operation(add)

val subtract = (x: Int, y:Int) => { x - y }
val multiply = (x: Int, y:Int) => { x*y }

operation(subtract)
operation(multiply)