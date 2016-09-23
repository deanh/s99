import annotation.tailrec

object s03 {
  // S03
  @tailrec
  def nth[A](n: Int, list: List[A]): Option[A] = (n, list) match {
    case (_, Nil)    => None
    case (0, h :: t) => Some(h)
    case (i, h :: t) => nth(i - 1, t)
  }
}
