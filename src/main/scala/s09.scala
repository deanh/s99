import annotation.tailrec

object s09 {
  // S09: pack
  def pack[A](list: List[A]): List[List[A]] = list match {
    case Nil      => Nil
    case h :: t   => {
      val (hs, rest) = list.span(_ == h)
      hs :: pack(rest)
    }
  }
}
