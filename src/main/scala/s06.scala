import annotation.tailrec
import s05._

object s06 {
  // S06
  def isPalindrome[A](list: List[A]): Boolean =
    list == reverse(list)
}
