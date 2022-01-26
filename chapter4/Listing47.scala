val countries: Set[String] = Set("Italy", "Spain", "France", "Germany")
val nameSize = countries.map(country => (country, country.length))
println(countries.map(_ + " - Europe")) 