def fibonacci(in: Int): Int =
    in match
        case 0 => 0
        case 1 => 1
        case n => fibonacci(n - 1) + fibonacci(n - 2)