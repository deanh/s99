import org.specs2.mutable.Specification

object s1to10Spec extends Specification {
  "1: The 'last' function" >> {
    "returns None for Nil" >> {
      s1to10.last(Nil) must_== None
    }
    "returns Some(x) for List(x)" >> {
      s1to10.last(List(1)) must_== Some(1)
    }
    "returns Some(n) for List(1,...,n)" >> {
      s1to10.last(List(1,2,3)) must_== Some(3)
    }
  }

  "2: The 'penultimate' function" >> {
    "returns None for Nil" >> {
      s1to10.penultimate(Nil) must_== None
    }
    "returns None for List(x)" >> {
      s1to10.penultimate(List(1)) must_== None
    }
    "returns Some(m) for List(1,...,m,n)" >> {
      s1to10.penultimate(List(1,2,3)) must_== Some(2)
    }
  }

  "3: The 'nth' function" >> {
    "returns None for n > length(list)" >> {
      s1to10.nth(2, List(1)) must_== None
    }
    "returns None for Nil (same as above)" >> {
      s1to10.nth(2, Nil) must_== None
    }
    "returns nth element" >> {
      s1to10.nth(2, List(0,1,2,3)) must_== Some(2)
      s1to10.nth(2, List(0,1,2)) must_== Some(2)
    }
  }

  "4: The 'length' function" >> {
    "returns 0 for Nil" >> {
      s1to10.length(Nil) must_== 0
    }
    "returns n for List(1,...,n)" >> {
      s1to10.length(List(1)) must_== 1
      s1to10.length(List(1,2,3)) must_== 3
    }
  }

  "5: The 'reverse' function" >> {
    "returns Nil for Nil" >> {
      s1to10.reverse(Nil) must_== Nil
      s1to10.reverseTail(Nil) must_== Nil
    }
    "returns List(n,...,1) for List(1,...,n)" >> {
      s1to10.reverse(List(1,2,3)) must_== List(3,2,1)
      s1to10.reverseTail(List(1,2,3)) must_== List(3,2,1)
    }
  }

  "6: The 'palindrome' function" >> {
    "returns true for Nil" >> {
      s1to10.isPalindrome(Nil) must_== true
    }
    "returns true for List(x)" >> {
      s1to10.isPalindrome(List(1)) must_== true
    }
    "returns false for List(1,...,n)" >> {
      s1to10.isPalindrome(List(1,2)) must_== false
      s1to10.isPalindrome(List(1,2,3)) must_== false
    }
    "returns true for odd length palindrome" >> {
      s1to10.isPalindrome(List(1,2,1)) must_== true
    }
    "returnes true for even length palindrome" >> {
      s1to10.isPalindrome(List(1,2,2,1)) must_== true
    }
  }

  "7: The 'flatten' function" >> {
    "returns Nil for Nil" >> {
      s1to10.flatten(Nil) must_== Nil
      s1to10.flattenFM(Nil) must_== Nil
    }
    "returns List(1) for List(1)" >> {
      s1to10.flatten(List(1)) must_== List(1)
      s1to10.flattenFM(List(1)) must_== List(1)
    }
    "returns List(1) for List(List(1))" >> {
      s1to10.flatten(List(List(1))) must_== List(1)
      s1to10.flattenFM(List(List(1))) must_== List(1)
    }
    "returns List(1,2) for List(1, List(2))" >> {
      s1to10.flatten(List(1, List(2))) must_== List(1,2)
      s1to10.flattenFM(List(1, List(2))) must_== List(1,2)
    }
  }

  "8: The 'compress' function" >> {
    "returns Nil for Nil" >> {
      s1to10.compress(Nil) must_== Nil
      s1to10.compressTail(Nil) must_== Nil
    }
    "returns List(1) for List(1)" >> {
      s1to10.compress(List(1)) must_== List(1)
      s1to10.compressTail(List(1)) must_== List(1)
    }
    "returns List(1,...,n) for List(1,...,n)" >> {
      s1to10.compress(List(1,2,3,4)) must_== List(1,2,3,4)
      s1to10.compressTail(List(1,2,3,4)) must_== List(1,2,3,4)
    }
    "returns List(1) for List(1,1,...,1)" >> {
      s1to10.compress(List(1,1,1,1,1)) must_== List(1)
      s1to10.compressTail(List(1,1,1,1,1)) must_== List(1)
    }
    "returns List(1,2) for List(1,1,2,2)" >> {
      s1to10.compress(List(1,1,2,2)) must_== List(1,2)
      s1to10.compressTail(List(1,1,2,2)) must_== List(1,2)
    }
  }
}
