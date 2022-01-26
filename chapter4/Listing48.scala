val countries: Set[String] = Set("Italy", "Spain", "France", "Germany")
countries.filter(country=>country.startsWith("I"))
countries.filter(country=>country.startsWith("I")).foreach(println)