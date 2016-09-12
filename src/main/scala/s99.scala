import annotation.tailrec

object s99 {
  @tailrec
  def last[A](list: List[A]): Option[A] = list match {
    case Nil      => None
    case h :: Nil => Some(h)
    case h :: t   => last(t)
  }

  @tailrec
  def penultimate[A](list: List[A]): Option[A] = list match {
    case Nil               => None
    case h :: Nil          => None
    case one :: two :: Nil => Some(one)
    case h :: t            => penultimate(t)
  }

  @tailrec
  def nth[A](n: Int, list: List[A]): Option[A] = (n, list) match {
    case (_, Nil)    => None
    case (0, h :: t) => Some(h)
    case (i, h :: t) => nth(i - 1, t)
  }

  @tailrec
  def length[A](list: List[A], cnt: Int = 0): Int = list match {
    case Nil    => cnt
    case h :: t => length(t, 1 + cnt)
  }

  def reverse[A](list: List[A]): List[A] = ???

  def isPalindrome[A](list: List[A]): Boolean = ???
}
