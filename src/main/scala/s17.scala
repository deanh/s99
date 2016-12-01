import annotation.tailrec

object s17 {
  // S17
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    @tailrec
    def moveN[S](m: Int, l1: List[S], l2: List[S]): (List[S], List[S]) =
      (m, (l1, l2)) match {
        case (0, (_, _))        => (l1, l2)
        case (_, (_, Nil))      => (l1, l2)
        case (i, (acc, h :: t)) => moveN(i - 1, h :: acc, t)
      }

    val (start, end) = moveN(n, Nil, list)
    (start.reverse, end)
  }
}
