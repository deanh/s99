import annotation.tailrec

object s02 {
  // S02
  @tailrec
  def penultimate[A](list: List[A]): Option[A] = list match {
    case Nil               => None
    case one :: two :: Nil => Some(one)
    case h :: t            => penultimate(t)
  }
}
