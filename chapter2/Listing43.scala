val strange : Any = true
val option = strange match
    case "test" => "String"
    case true =>"Boolean"