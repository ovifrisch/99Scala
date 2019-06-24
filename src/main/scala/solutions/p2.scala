package solutions

class p2 {

  // List(1, 2, 3)
  def penultimate[T](list : List[T]) : T = {
    list match {
      case h :: _ :: Nil => h
      case _ :: tail => penultimate(tail)
      case _ => throw new NoSuchElementException
    }
  }
}
