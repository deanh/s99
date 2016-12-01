import org.specs2.mutable.Specification

object s20Spec extends Specification {
  "S20: The 'removeAt' function" >> {
    "s-99 example passes" >> {
      s20.removeAt(1, List('a, 'b, 'c, 'd)) must_==
        (List('a, 'c, 'd), Some('b))
    }
    "returns (Nil, None) for Nil" >> {
      s20.removeAt(3, Nil) must_== (Nil, None)
    }
    "returns (list, Nil) for n > list.length" >> {
      s20.removeAt(5, List(1, 2, 3)) must_== (List(1, 2, 3), None)
    }
  }
}
