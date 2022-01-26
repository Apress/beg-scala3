def returnNoneFunction() : Option[String] = None
def returnSomeFunction() : Option[String] = Some("Your logic works")
val obtainInformation = returnNoneFunction() orElse returnSomeFunction()