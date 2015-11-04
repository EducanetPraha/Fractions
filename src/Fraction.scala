

class Fraction(val num: Int, val den: Int) extends Comparable[Fraction] {

  def *(other: Fraction): Fraction = new Fraction(num * other.num, den * other.den).simplify()

  def /(other: Fraction): Fraction = ???
  def +(other: Fraction): Fraction = ???
  def -(other: Fraction): Fraction = ???

  def isSimple(): Boolean = {
    val s = simplify()
    (s.den == den && s.num == num)
  };

  def simplify(): Fraction = ???

  // TODO a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
  override def compareTo(o: Fraction): Int = ???

  override def toString() = "{"+ num + "/" + den + "}"

}
