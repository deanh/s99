import org.specs2.mutable.Specification

object s08Spec extends Specification {
  "S08: The 'compress' function" >> {
    "returns Nil for Nil" >> {
      s08.compress(Nil) must_== Nil
      s08.compressTail(Nil) must_== Nil
    }
    "returns List(1) for List(1)" >> {
      s08.compress(List(1)) must_== List(1)
      s08.compressTail(List(1)) must_== List(1)
    }
    "returns List(1,...,n) for List(1,...,n)" >> {
      s08.compress(List(1,2,3,4)) must_== List(1,2,3,4)
      s08.compressTail(List(1,2,3,4)) must_== List(1,2,3,4)
    }
    "returns List(1) for List(1,1,...,1)" >> {
      s08.compress(List(1,1,1,1,1)) must_== List(1)
      s08.compressTail(List(1,1,1,1,1)) must_== List(1)
    }
    "returns List(1,2) for List(1,1,2,2)" >> {
      s08.compress(List(1,1,2,2)) must_== List(1,2)
      s08.compressTail(List(1,1,2,2)) must_== List(1,2)
    }
  }
}
