val add = (x: Int, y: Int) => x + y
add(1,2)

val partiallyAdd = add(1, _:Int)
partiallyAdd(2)