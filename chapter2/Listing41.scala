val month = 2
val season = month match
    case 1 | 2 => "Winter"
    case 6 | 7 => "Summer"
    case _ => ""