import org.specs2.mutable.Specification

object s09Spec extends Specification {
  "S09: The 'pack' function" >> {
    "returns Nil for Nil" >> {
      s09.pack(Nil) must_== Nil
    }
    "returns List(List(1)) for List(1)" >> {
      s09.pack(List(1)) must_== List(List(1))
    }
    "returns List(List(1, 1)) for List(1, 1)" >> {
      s09.pack(List(1, 1)) must_== List(List(1, 1))
    }
    "returns List(List(1, 1, 1)) for List(1, 1, 1)" >> {
      s09.pack(List(1, 1, 1)) must_== List(List(1, 1, 1))
    }
    "returns List(List(1), List(2, 2)) for List(1, 2, 2)" >> {
      s09.pack(List(1, 2, 2)) must_== List(List(1), List(2, 2))
    }
    "returns List(List(1, 1), List(2)) for List(1, 1, 2)" >> {
      s09.pack(List(1, 1, 2)) must_== List(List(1, 1), List(2))
    }
  }
}
