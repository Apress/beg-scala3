enum Color extends Enum[Color]:
    case RED, BLUE, GREEN;

@main def main =
    val color = Color.valueOf("BLUE")
    print(color)
