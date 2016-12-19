import org.specs2.mutable.Specification

object s24Spec extends Specification {
  "S24: The 'lotto' function" >> {
    "pulls n elements" >> {
      s24.lotto(3, 6).length must_== 3
    }
    "pulls list.length elements if n > list.length" >> {
      s24.lotto(6, 3).length must_== 3
    }
  }
}
