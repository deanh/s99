import annotation.tailrec

object s1to10 {
  // S01
  @tailrec
  def last[A](list: List[A]): Option[A] = list match {
    case Nil      => None
    case h :: Nil => Some(h)
    case h :: t   => last(t)
  }

  // S02
  @tailrec
  def penultimate[A](list: List[A]): Option[A] = list match {
    case Nil               => None
    case one :: two :: Nil => Some(one)
    case h :: t            => penultimate(t)
  }

  // S03
  @tailrec
  def nth[A](n: Int, list: List[A]): Option[A] = (n, list) match {
    case (_, Nil)    => None
    case (0, h :: t) => Some(h)
    case (i, h :: t) => nth(i - 1, t)
  }

  // S04
  @tailrec
  def length[A](list: List[A], cnt: Int = 0): Int = list match {
    case Nil    => cnt
    case h :: t => length(t, 1 + cnt)
  }

  // S05
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil    => Nil
    case h :: t => reverse(t) ++ List(h)
  }

  // S05: tail recursive
  def reverseTail[A](list: List[A]): List[A] = {
    @tailrec
    def rev(l: List[A], accum: List[A]): List[A] = l match {
      case Nil    => accum
      case h :: t => rev(t, h :: accum)
    }
    rev(list, Nil)
  }

  // S06
  def isPalindrome[A](list: List[A]): Boolean =
    list == reverse(list)

  // S07
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case h :: t => h match {
      case xs : List[_] => flatten(xs) ::: flatten(t)
      case x            => h :: flatten(t)
    }
  }

  // S07: using flatMap
  def flattenFM(list: List[Any]): List[Any] = list flatMap {
    case l : List[_] => flattenFM(l)
    case x           => List(x)
  }

  // S08
  def compress[A](list: List[A]): List[A] = list match {
    case Nil                             => Nil
    case one :: two :: t if (one == two) => compress(two :: t)
    case h :: t                          => h :: compress(t)
  }

  // S08: tail recursive
  def compressTail[A](list: List[A]): List[A] = {
    @tailrec
    def comp[A](l: List[A], accum: List[A]): List[A] = l match {
      case Nil                             => accum
      case one :: two :: t if (one == two) => comp(two :: t, accum)
      case h :: t                          => comp(t, accum ::: List(h))
    }
    comp(list, Nil)
  }
}
