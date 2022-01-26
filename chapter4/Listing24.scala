def calc(expr: Expr, vars: Map[String, Int]): Int = expr match {
  case Add(left, right) => calc(left, vars) + calc(right, vars)
  case Mul(left, right) => calc(left, vars) * calc(right, vars)
  case Val(v) => v
  case Var(name) => vars(name)
}