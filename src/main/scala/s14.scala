import annotation.tailrec

object s14 {
  // S14
  def duplicate[A](list: List[A]): List[A] =
    list.flatMap(x => List(x, x))
}
