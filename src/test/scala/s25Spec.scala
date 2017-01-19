import org.specs2.mutable.Specification

object s25Spec extends Specification {
  "S25: The 'randomPermute' function" >> {
    "returns a list with the same elements, in different order" >> {
      val list = List(1, 2, 3, 4, 5)
      val perm = s25.randomPermute(list)
      perm.length must_== list.length
      perm.sorted must_== list
    }
  }
}
