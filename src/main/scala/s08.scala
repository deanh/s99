import annotation.tailrec

object s08 {
  // S08
  def compress[A](list: List[A]): List[A] = list match {
    case Nil                             => Nil
    case one :: two :: t if (one == two) => compress(two :: t)
    case h :: t                          => h :: compress(t)
  }

  // S08: tail recursive
  def compressTail[A](list: List[A]): List[A] = {
    @tailrec
    def comp[A](l: List[A], accum: List[A]): List[A] = l match {
      case Nil                             => accum
      case one :: two :: t if (one == two) => comp(two :: t, accum)
      case h :: t                          => comp(t, accum ::: List(h))
    }
    comp(list, Nil)
  }
}
