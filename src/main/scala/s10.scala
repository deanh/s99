import annotation.tailrec

object s10 {
  // S10
  def encode[A](list: List[A]): List[(Int, A)] =
    s09.pack(list).map(x => (x.length, x.head))
}
