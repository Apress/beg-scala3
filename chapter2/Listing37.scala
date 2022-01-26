val names = Array("John", "Anna", "Isabel")
for i <- 0 until names.size do
    println(names(i))

for(name <- names)
  println(name)

names.foreach(name => println(name))

val shortNames = for name <- names if name.size <=4  yield name
