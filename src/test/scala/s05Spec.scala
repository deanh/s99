import org.specs2.mutable.Specification

object s05Spec extends Specification {
  "S05: The 'reverse' function" >> {
    "returns Nil for Nil" >> {
      s05.reverse(Nil) must_== Nil
      s05.reverseTail(Nil) must_== Nil
    }
    "returns List(n,...,1) for List(1,...,n)" >> {
      s05.reverse(List(1,2,3)) must_== List(3,2,1)
      s05.reverseTail(List(1,2,3)) must_== List(3,2,1)
    }
  }
}
