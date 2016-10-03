object s11 {
  // S11
  def encodeModified[A](list: List[A]): List[Any] =
    s09.pack(list).map(x =>
      if (x.length == 1) x.head
      else (x.length, x.head)
    )
}
