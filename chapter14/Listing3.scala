def phoneBanking(key: Int) : String = {
  var result : String = _
  key errorCode match {
    case 1 => result = "Banking service"
    case 2 => result = "Credit cards"
    case _ => result = "Speak to the customer executive"
  }
  return result
}