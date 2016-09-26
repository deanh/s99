import org.specs2.mutable.Specification

object s10Spec extends Specification {
  "S10: The 'encode' function" >> {
    "returns List((1, 1)) for List(1)" >> {
      s10.encode(List(1)) must_== List((1, 1))
    }
    "returns List((2, 'a'), (1, 'b')) for List('a, 'a, 'b)" >> {
      s10.encode(List('a, 'a, 'b)) must_== List((2, 'a), (1, 'b))
    }
  }
}
