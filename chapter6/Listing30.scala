def roman(in: List[Char]): Int =
  in match
    case 'I' :: 'V' :: rest => 4 + roman(rest)
    case 'I' :: 'X' :: rest => 9 + roman(rest)
    case 'I' :: rest => 1 + roman(rest)
    case 'V' :: rest => 5 + roman(rest)
    case 'X' :: 'L' :: rest => 40 + roman(rest)
    case 'X' :: 'C' :: rest => 90 + roman(rest)
    case 'X' :: rest => 10 + roman(rest)
    case 'L' :: rest => 50 + roman(rest)
    case 'C' :: 'D' :: rest => 400 + roman(rest)
    case 'C' :: 'M' :: rest => 900 + roman(rest)
    case 'C' :: rest => 100 + roman(rest)
    case 'D' :: rest => 500 + roman(rest)
    case 'M' :: rest => 1000 + roman(rest)
    case _ => 0