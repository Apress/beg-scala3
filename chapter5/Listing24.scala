def handleRequest(req: List[String])(exceptions: PartialFunction[List[String], String]): String =
    if (exceptions.isDefinedAt(req)) then
        exceptions(req)
    else
        "Handling URL " + req + " in the normal way"