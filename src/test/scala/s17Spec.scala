import org.specs2.mutable.Specification

object s17Spec extends Specification {
  "S17: The 'split' function" >> {
    "returns (Nil, Nil) for an empty List" >> {
      s17.split(3, Nil) must_== (Nil, Nil)
    }
    "returns (Nil, list) for n == 0" >> {
      s17.split(0, List(1,2,3)) must_== (Nil, List(1,2,3))
    }
    "returns (list, Nil) for n > list length" >> {
      s17.split(5, List(1,2,3)) must_== (List(1,2,3), Nil)
    }
    "returns (List(1,2), List(3,4)) for split(2, List(1,2,3,4))" >> {
      s17.split(2, List(1,2,3,4)) must_== (List(1,2), List(3,4))
    }
  }
}
