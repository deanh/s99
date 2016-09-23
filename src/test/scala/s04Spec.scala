import org.specs2.mutable.Specification

object s04Spec extends Specification {
  "S04: The 'length' function" >> {
    "returns 0 for Nil" >> {
      s04.length(Nil) must_== 0
    }
    "returns n for List(1,...,n)" >> {
      s04.length(List(1)) must_== 1
      s04.length(List(1,2,3)) must_== 3
    }
  }
}
