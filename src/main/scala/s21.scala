import annotation.tailrec

object s21 {
  // S21
  def insertAt[T](el: T, n: Int, list: List[T]): List[T] = {
    val (front, back) = s17.split(n, list)
    front ++ (el :: back)
  }
}
