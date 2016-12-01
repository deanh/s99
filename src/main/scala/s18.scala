import annotation.tailrec
import s17.split

object s18 {
  // S18
  def slice[T](s: Int, e: Int, list: List[T]): List[T] = {
    if (e - s <= 0) Nil
    else {
      val (_, rest)   = split(s, list)
      val (middle, _) = split(e - s, rest)
      middle
    }
  }
}
