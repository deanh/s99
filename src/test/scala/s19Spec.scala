import org.specs2.mutable.Specification

object s19Spec extends Specification {
  "S19: The 'rotate' function" >> {
    "returns list if n == 0" >> {
      s19.rotate(0, List(1,2,3)) must_== List(1,2,3)
    }
    "returns example rotate from s-99 site" >> {
      val ret = s19.rotate(3, List('a, 'b, 'c,
                                   'd, 'e, 'f,
                                   'g, 'h, 'i,
                                   'j, 'k))
      ret must_== List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }
    "negative index for rotation" >> {
      val ret = s19.rotate(-2, List('a, 'b, 'c,
                                    'd, 'e, 'f,
                                    'g, 'h, 'i,
                                    'j, 'k))
      ret must_== List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    }
  }
}
