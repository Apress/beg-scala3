val seq = Seq("one", 2, 3.5)
def check [T <: Matchable](seq: Seq[T]) =
    seq.map {
      case i: Int => println(s"Int $i")
      case s: String => println(s"String $s")
      case f: Float => println(s"Float $f")
      case other => println(s"Other $other")
    }

check(seq)   