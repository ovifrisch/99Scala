package solutions

class p5 {
  def reverse[T](list : List[T]) : List[T] = {
    def helper[T](list : List[T], acc : List[T]): List[T] = {
      if (list == Nil) acc
      else helper(list.tail, list.head :: acc)
    }
    helper(list, List())
  }
}
