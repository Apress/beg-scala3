val anyList = List(1, "A", 2, 2.5, 'a')

for (m <- anyList)
    m match
        case i: Int => println("Integer: " + i)
        case s: String => println("String: " + s)
        case f: Double => println("Double: " + f)
        case other => println("other: " + other)