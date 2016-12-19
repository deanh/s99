object timer {
  def time[T](iter: Int, block: => T): T = {
    val t0 = System.nanoTime()
    for (i <- 1 to (iter - 1)) {
      block
    }
    val result = block
    val t1 = System.nanoTime()
    val out = s"""Iterations: $iter
      |Avg time: ${(t1 - t0) / iter} ns
      |Elapsed time: ${(t1 - t0)} ns""".stripMargin
    println(out)
    result
  }

  def time[R](block: => R): R = {
    time(1, block)
  }
}
