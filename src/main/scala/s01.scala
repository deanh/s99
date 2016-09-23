import annotation.tailrec

object s01 {
  // S01
  @tailrec
  def last[A](list: List[A]): Option[A] = list match {
    case Nil      => None
    case h :: Nil => Some(h)
    case h :: t   => last(t)
  }
}
