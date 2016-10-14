import annotation.tailrec

object s12 {
  // S12
  def decode[A](list: List[(Int, A)]): List[A] = {
    def tupToList(t: (Int, A)): List[A] = t match {
      case (0, a) => Nil
      case (i, a) => a :: tupToList((i - 1, a))
    }
    list.flatMap(tupToList(_))
  }
}
