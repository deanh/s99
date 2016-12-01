import org.specs2.mutable.Specification

object s15Spec extends Specification {
  "S15: The 'duplicateN' function" >> {
    "returns Nil for Nil" >> {
      s15.duplicateN(1, Nil) must_== Nil
      s15.duplicateN(2, Nil) must_== Nil
      s15.duplicateN(0, Nil) must_== Nil
    }
    "returns Nil for n == 0" >> {
      s15.duplicateN(0, List(1,2,3)) must_== Nil
      s15.duplicateN(0, Nil) must_== Nil
    }
    "returns List(1,1) for List(1), n == 2" >> {
      s15.duplicateN(2, List(1)) must_== List(1, 1)
    }
    "returns List(1,1,1,2,2,2,3,3,3) for List(1,2,3), n ==3" >> {
      s15.duplicateN(3, List(1, 2, 3)) must_==
        List(1,1,1,2,2,2,3,3,3)
    }
  }
}
