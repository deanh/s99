import annotation.tailrec

object s20 {
  // S20
  def removeAt[T](n: Int, list: List[T]): (List[T], Option[T]) = {
    val (front, back) = s17.split(n, list)
    back match {
      case Nil    => (front, None)
      case h :: t => (front ++ t, Some(h)) 
    }
  }
}
