import org.specs2.mutable.Specification

object s02Spec extends Specification {
  "S02: The 'penultimate' function" >> {
    "returns None for Nil" >> {
      s02.penultimate(Nil) must_== None
    }
    "returns None for List(x)" >> {
      s02.penultimate(List(1)) must_== None
    }
    "returns Some(m) for List(1,...,m,n)" >> {
      s02.penultimate(List(1,2,3)) must_== Some(2)
    }
  }
}
