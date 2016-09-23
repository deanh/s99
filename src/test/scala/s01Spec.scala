import org.specs2.mutable.Specification

object s01Spec extends Specification {
  "S01: The 'last' function" >> {
    "returns None for Nil" >> {
      s01.last(Nil) must_== None
    }
    "returns Some(x) for List(x)" >> {
      s01.last(List(1)) must_== Some(1)
    }
    "returns Some(n) for List(1,...,n)" >> {
      s01.last(List(1,2,3)) must_== Some(3)
    }
  }
}
