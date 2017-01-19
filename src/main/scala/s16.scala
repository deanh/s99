import annotation.tailrec

object s16 {
  // S16
  def drop[T](n: Int, list: List[T]): List[T] = {
    type State = (Int, List[T])
    @tailrec
    def dropWithState(n: Int, list: List[T], state: State): List[T] = {
      val (cnt, acc) = state
      (cnt % n, list) match {
        case (_, Nil)    => acc
        case (0, h :: t) => dropWithState(n, t, (cnt + 1, acc))
        case (_, h :: t) => dropWithState(n, t, (cnt + 1, h :: acc))
      }
    }
    dropWithState(n, list, (1, Nil)).reverse
  }
}
