val multimedia = Seq(
  "Photography: author=Richard Avedon, place=New York",
  "Movie: name=Casablanca, director=Michael Curtiz",
  "Music: name=Fly on the moon, author=Fran Sinatra");

val PhotographyExtractorRE = """Photography: author=([^,]+),\s+place=(.+)""".r
val MovieExtractorRE = """Movie: name=([^,]+),\s+director=(.+)""".r

multimedia.map {
  case PhotographyExtractorRE(author, place) => println(s"Phography - Author: $author - Place: $place")
  case MovieExtractorRE(name, director) => println(s"Movie - Name: $name - Director: $director")
  case unknown => println(s"Unknown entry $unknown")
}