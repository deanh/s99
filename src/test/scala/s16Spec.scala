import org.specs2.mutable.Specification

object s16Spec extends Specification {
  "S16: The 'drop' function" >> {
    "returns Nil for Nil" >> {
      s16.drop(1, Nil) must_== Nil
    }
    "returns List(0,2,4,6,8) for drop(2, (0 until 10).toList)" >> {
      s16.drop(2, (0 until 10).toList) must_== List(0,2,4,6,8)
    }
  }
}
