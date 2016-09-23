import annotation.tailrec

object s07 {
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
}
