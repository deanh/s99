import org.specs2.mutable.Specification

object s12Spec extends Specification {
  "S12: The 'decode' function" >> {
    "retuens List('a) for List(1, 'a)" >> {
      s12.decode(List((1, 'a))) must_== List('a)
    }
    "returns List('a, 'b, 'b, 'b) for List((1, 'a), (3, 'b))" >> {
      s12.decode(List((1, 'a), (3, 'b))) must_== List('a, 'b, 'b, 'b)
    }
  }
}
