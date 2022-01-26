def phoneBanking (key: Int) : String =
  val result = key match
    case 1 => "Banking service"
    case 2 => "Credit cards"
    case 3 => "Speak to the customer executive"
  return result