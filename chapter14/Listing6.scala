def read1(in: java.io.BufferedReader): List[String] =
  var ret: List[String] = Nil
  var line = in.readLine
  while(line!=null)
    ret ::= line
    line = in.readLine
  ret.reverse