class Number(number: Int) {
  def get: Int = number
}
trait Incrementing extends Number {
  override def get: Int = super.get + 1
}
trait Decrementing extends Number {
  override def get: Int = super.get - 1
}
trait Doubling extends Number {
  override def get: Int = super.get * 2
}
class MyNumber(number: Int) extends Number(number: Int) 
  with Decrementing with Doubling with Incrementing
