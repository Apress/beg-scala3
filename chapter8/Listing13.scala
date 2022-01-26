def add(in: Holder[Int])= in.data = in.data + 1
val h = Holder(0)
add(h)
h.data