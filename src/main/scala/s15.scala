import annotation.tailrec

object s15 {
  // S15
  def duplicateN[A](i: Int, list: List[A]): List[A] = {
    def nTimes[A](n: Int, a: A): List[A] =
      if (n == 0) Nil
      else a :: nTimes(n - 1, a)

    list flatMap(x => nTimes(i, x))
  }
}
