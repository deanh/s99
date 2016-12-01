import annotation.tailrec

object s19 {
  // S19
  def rotate[T](n: Int, list: List[T]): List[T] = {
    val idx = if (n >= 0) n
              else list.length + n
    val (start, end) = s17.split(idx, list)
    end ++ start
  }

}
