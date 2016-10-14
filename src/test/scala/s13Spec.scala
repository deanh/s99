import org.specs2.mutable.Specification

object s13Spec extends Specification {
  "S13: The 'encodeDirect' function" >> {
    "returns List((1, 1)) for List(1)" >> {
      s13.encodeDirect(List(1)) must_== List((1, 1))
    }
    "returns List((2, 'a'), (1, 'b')) for List('a, 'a, 'b)" >> {
      s13.encodeDirect(List('a, 'a, 'b)) must_== List((2, 'a), (1, 'b))
    }
  }
}
