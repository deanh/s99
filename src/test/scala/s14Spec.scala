import org.specs2.mutable.Specification

object s14Spec extends Specification {
  "S14: The 'duplicate' function" >> {
    "returns Nil for Nil" >> {
      s14.duplicate(Nil) must_== Nil
    }
    "returns List(1, 1) for List(1)" >> {
      s14.duplicate(List(1)) must_== List(1, 1)
    }
  }
}
