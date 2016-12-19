import org.specs2.mutable.Specification
import timer.time

object s23Spec extends Specification {
  "S23: The 'randomSelect' function" >> {
    "pulls n elements for n" >> {
      s23.randomSelect(2, List(1, 2, 3, 4)).length must_== 2
    }
    "pulls 0 elements for Nil" >> {
      s23.randomSelect(2, Nil).length must_== 0
    }
    "puls list.length elements if n > list.length" >> {
      s23.randomSelect(3, List(1,2)).length must_== 2
    }
  }
}
