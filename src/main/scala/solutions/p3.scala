package solutions

class p3 {
  /*
  nth element of a list
   */
  def nth[T](list : List[T], n : Int) : T = {
    if (n == 0 && list == Nil) throw new NoSuchElementException
    else if (n == 0) list.head
    else nth(list.tail, n - 1)
  }
}
