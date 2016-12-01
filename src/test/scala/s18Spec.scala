import org.specs2.mutable.Specification

object s18Spec extends Specification {
  "S18: The 'slice' function" >> {
    "returns middle 4" >> {
      s18.slice(3, 7, List('a, 'b, 'c,
                           'd, 'e, 'f,
                           'g, 'h, 'i)) must_== List('d, 'e, 'f, 'g)
    }
    "returns Nil if start is after end of List" >> {
      s18.slice(7, 8, List(1,2,3)) must_== Nil
    }
    "returns Nil if start is after end idx" >> {
      s18.slice(7, 4, List(1,2,3,4,5,6,7,8)) must_== Nil
    }
    "returns Nil if start is < 0" >> {
      s18.slice(-1, 4, List(1,2,3,4)) must_== Nil
    }
  }
}
