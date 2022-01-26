class ClassA extends TraitA:
  def methodA(): Unit = print("methodA")
  def methodAWithParam(param :String): Unit = print(param)
  def methodWithReturnType: String = "something"