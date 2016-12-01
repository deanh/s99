import annotation.tailrec

object s22 {
  // S22
  def range(start: Int, end: Int): List[Int] = {
    if (start > end) Nil
    else {
      start :: range(start + 1, end)
    }
  }
}
