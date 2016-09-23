import annotation.tailrec

object s04 {
  // S04
  @tailrec
  def length[A](list: List[A], cnt: Int = 0): Int = list match {
    case Nil    => cnt
    case h :: t => length(t, 1 + cnt)
  }
}
