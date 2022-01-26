def print(strArray: Array[String]): Unit =
  var i = 0
  while (i < strArray.length) {
    println(strArray (i))
    i += 1
  }

val strArray = Array("Vishal Layka", "David Pollak")
print(strArray)