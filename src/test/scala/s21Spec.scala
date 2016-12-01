import org.specs2.mutable.Specification

object s21Spec extends Specification {
  "S21: The 'insertAt' function" >> {
    "returns List('a) for 'a, 1, and Nil" >> {
      s21.insertAt('a, 1, Nil) must_== List('a)
    }
    "inserts at end when n > list.length" >> {
      s21.insertAt('a, 5, List('b, 'c)) must_== List('b, 'c, 'a)
    }
    "inserts a pos n when position exists" >> {
      s21.insertAt('a, 1, List('b, 'c, 'd)) must_== List('b, 'a, 'c, 'd)
    }
  }
}
