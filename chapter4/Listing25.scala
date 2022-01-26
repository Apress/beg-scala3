def transformToInt(number:String) : Option[Int] =
    try
        Some(Integer.parseInt(number))
    catch
        case e: NumberFormatException => None

transformToInt("1")
transformToInt("a")