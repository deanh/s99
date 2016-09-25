import annotation.tailrec

object s09 {
  // S09
  def pack[A](list: List[A]): List[List[A]] = list match {
    case Nil      => Nil
    case h :: Nil => List(List(h))
    case h :: t   => {
      val (hs, rest) = list.span(_ == h)
      hs :: pack(rest)
    }
  }
}
