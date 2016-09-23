import annotation.tailrec

object s05 {
  // S05
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil    => Nil
    case h :: t => reverse(t) ++ List(h)
  }

  // S05: tail recursive
  def reverseTail[A](list: List[A]): List[A] = {
    @tailrec
    def rev(l: List[A], accum: List[A]): List[A] = l match {
      case Nil    => accum
      case h :: t => rev(t, h :: accum)
    }
    rev(list, Nil)
  }
}
