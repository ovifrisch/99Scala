package solutions

class p6 {
  /*
  is a list a palindriome
   */
  def isPalindrome[T](list : List[T]) : Boolean = {
    list == list.reverse
  }
}
