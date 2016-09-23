import org.specs2.mutable.Specification

object s06Spec extends Specification {
  "S06: The 'palindrome' function" >> {
    "returns true for Nil" >> {
      s06.isPalindrome(Nil) must_== true
    }
    "returns true for List(x)" >> {
      s06.isPalindrome(List(1)) must_== true
    }
    "returns false for List(1,...,n)" >> {
      s06.isPalindrome(List(1,2)) must_== false
      s06.isPalindrome(List(1,2,3)) must_== false
    }
    "returns true for odd length palindrome" >> {
      s06.isPalindrome(List(1,2,1)) must_== true
    }
    "returnes true for even length palindrome" >> {
      s06.isPalindrome(List(1,2,2,1)) must_== true
    }
  }

}
