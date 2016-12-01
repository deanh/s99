import annotation.tailrec

object s16 {
  // S16
  def drop[T](n: Int, list: Seq[T]): Seq[T] =
    for {
      (el, i) <- list.zipWithIndex
      if ((i + 1) % n != 0)
    } yield el
}
