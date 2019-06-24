package solutions

class p1 {
  def last_element[T] (list : List[T]) : T = {
    list match {
      case Nil => throw new NoSuchElementException
      case x :: Nil => x
      case _ :: tail => last_element(tail)
    }
  }
}