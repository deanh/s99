import org.specs2.mutable.Specification

object s07Spec extends Specification {
  "S07: The 'flatten' function" >> {
    "returns Nil for Nil" >> {
      s07.flatten(Nil) must_== Nil
      s07.flattenFM(Nil) must_== Nil
    }
    "returns List(1) for List(1)" >> {
      s07.flatten(List(1)) must_== List(1)
      s07.flattenFM(List(1)) must_== List(1)
    }
    "returns List(1) for List(List(1))" >> {
      s07.flatten(List(List(1))) must_== List(1)
      s07.flattenFM(List(List(1))) must_== List(1)
    }
    "returns List(1,2) for List(1, List(2))" >> {
      s07.flatten(List(1, List(2))) must_== List(1,2)
      s07.flattenFM(List(1, List(2))) must_== List(1,2)
    }
  }
}
