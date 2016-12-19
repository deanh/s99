import annotation.tailrec
import scala.util.Random

object s23 {
  // S23
  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def randSelWithSize(m: Int, size: Int, l: List[T]): List[T] = {
      if (m == 0) Nil
      else {
        val (rest, opt) = s20.removeAt(Random.nextInt(size), l)
        opt match {
          case None    => Nil
          case Some(x) => (x :: randSelWithSize(m - 1, size - 1, rest))
        }
      }
    }
    val len = list.length
    val num = if (n > len) len else n
    randSelWithSize(num, len, list)
  }
}
