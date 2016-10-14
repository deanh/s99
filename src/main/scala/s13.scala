import annotation.tailrec

object s13 {
  // S13
  def encodeDirect[A](list: List[A]): List[(Int, A)] = list match {
    case Nil => Nil
    case h :: t => {
      val (hs, rest) = list.span(_ == h)
      (hs.length, hs.head) :: encodeDirect(rest)
    }
  }
}
