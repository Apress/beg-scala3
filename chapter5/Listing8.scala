def test2(in: Any) =
    in match
        case s: String => "String, length "+s.length
        case i: Int if i > 0 => "Natural Int"
        case i: Int => "Another Int"
        case a: AnyRef => a.getClass.getName
        case _ => "null"