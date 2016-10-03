import org.specs2.mutable.Specification

object s11Spec extends Specification {
  "S11: The 'encodeModified' function" >> {
    "returns List((1, 1)) for List(1)" >> {
      s11.encodeModified(List(1)) must_== List(1)
    }
    "returns List((2, 'a'), (1, 'b')) for List('a, 'a, 'b)" >> {
      s11.encodeModified(List('a, 'a, 'b)) must_== List((2, 'a), 'b)
    }
  }
}
