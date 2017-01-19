import annotation.tailrec

object s25 {
  // S25
  def randomPermute[T](list: List[T]): List[T] =
    s23.randomSelect(list.length, list)
}
