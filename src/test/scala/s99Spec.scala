import org.specs2.mutable.Specification

object s99Spec extends Specification {
  "The last function" >> {
    "return None for Nil" >> {
      s99.last(Nil) must_== None
    }
    "return Some(x) for List(x)" >> {
      s99.last(List(1)) must_== Some(1)
    }
    "return Some(n) for List(1,...,n)" >> {
      s99.last(List(1,2,3)) must_== Some(3)
    }
  }
}
