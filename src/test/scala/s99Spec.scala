import org.specs2.mutable.Specification

object s99Spec extends Specification {
  "The 'last' function" >> {
    "returns None for Nil" >> {
      s99.last(Nil) must_== None
    }
    "returns Some(x) for List(x)" >> {
      s99.last(List(1)) must_== Some(1)
    }
    "returns Some(n) for List(1,...,n)" >> {
      s99.last(List(1,2,3)) must_== Some(3)
    }
  }

  "The 'penultimate' function" >> {
    "returns None for Nil" >> {
      s99.penultimate(Nil) must_== None
    }
    "returns None for List(x)" >> {
      s99.penultimate(List(1)) must_== None
    }
    "returns Some(m) for List(1,...,m,n)" >> {
      s99.penultimate(List(1,2,3)) must_== Some(2)
    }
  }

  "The 'nth' function" >> {
    "returns None for n > length(list)" >> {
      s99.nth(2, List(1)) must_== None
    }
    "returns None for Nil (same as above)" >> {
      s99.nth(2, Nil) must_== None
    }
    "returns nth element" >> {
      s99.nth(2, List(0,1,2,3)) must_== Some(2)
      s99.nth(2, List(0,1,2)) must_== Some(2)
    }
  }

  "The 'length' function" >> {
    "returns 0 for Nil" >> {
      s99.length(Nil) must_== 0
    }
    "returns n for List(1,...,n)" >> {
      s99.length(List(1)) must_== 1
      s99.length(List(1,2,3)) must_== 3
    }
  }
}
