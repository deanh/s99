import annotation.tailrec

object s24 {
  // S24
  def lotto(n: Int, tot: Int): List[Int] = {
    val num = if (n > tot) tot else n
    s23.randomSelect(num, (1 to tot).toList)
  }
}
