var movies: Map[String, String] = Map("ET" -> "Science fiction", "Saw" -> "Horror")
movies -= ("ET")
println(movies)
movies = movies.removed("Saw")