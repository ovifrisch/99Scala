package solutions

class p4 {
  def length[T](list : List[T]) : Int = {
    if (list == Nil) 0 else 1 + length(list.tail)
  }
}
