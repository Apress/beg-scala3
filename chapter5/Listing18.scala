abstract class Any:
    def isInstanceOf
    def getClass
    //and more methods.

trait Matchable extends Any

class AnyVal extends Any, Matchable

class AnyRef extends Any, Matchable