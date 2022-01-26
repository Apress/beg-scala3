def getNum(in: Getable[Number]) = in.data.intValue
def gd = Getable(java.lang.Double.valueOf(33.3))
getNum(gd)
