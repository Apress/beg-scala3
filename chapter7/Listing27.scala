trait IgnoresName:
  this: KnowsName => def ignoreName(when: String): Boolean
  def currentName(when: String): Option[String] =
    if ignoreName(when) then None else Some(name)