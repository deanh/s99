import org.specs2.mutable.Specification

object s22Spec extends Specification {
  "S22: The 'range' function" >> {
    "range generates Nil if start < end" >> {
      s22.range(5, 4) must_== Nil
    }
    "range generates single element list if start == end" >> {
      s22.range(5, 5) must_== List(5)
    }
    "range generates a range of ints" >> {
      s22.range(1,5) must_== List(1,2,3,4,5)
    }
  }
}
