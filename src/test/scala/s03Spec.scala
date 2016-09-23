import org.specs2.mutable.Specification

object s03Spec extends Specification {
  "S03: The 'nth' function" >> {
    "returns None for n > length(list)" >> {
      s03.nth(2, List(1)) must_== None
    }
    "returns None for Nil (same as above)" >> {
      s03.nth(2, Nil) must_== None
    }
    "returns nth element" >> {
      s03.nth(2, List(0,1,2,3)) must_== Some(2)
      s03.nth(2, List(0,1,2)) must_== Some(2)
    }
  }
}
