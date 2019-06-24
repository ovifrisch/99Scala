package solutions

import org.scalatest.FunSuite
class TestSuite extends FunSuite {

  trait testLists {
    def p1 = new solutions.p1
    def p2 = new solutions.p2
    def p3 = new solutions.p3
    def p4 = new solutions.p4
    def p5 = new solutions.p5
    def p6 = new solutions.p6
    val x1 = List(1, 2, 3)
    val x2 = List()
    val x3 = List(3)
    val x4 = List(1, 2, 3, 4, 5)
    val x5 = List(1, 1, 2, 2, 1, 1)
    val x6 = List('a', 'b', 'a')
  }

  test("p1") {
    new testLists {
      assert(p1.last_element(x1) == 3)
      assertThrows[NoSuchElementException] {
        p1.last_element(x2)
      }
      assert(p1.last_element(x3) == 3)
    }
  }

  test("p2") {
    new testLists {
      assert(p2.penultimate(x4) == 4)
      assertThrows[NoSuchElementException] {
        p2.penultimate(x3)
      }
      assertThrows[NoSuchElementException] {
        p2.penultimate(x2)
      }
    }
  }

  test("p3") {
    new testLists {
      assert(p3.nth(x4, 0) == 1)
      assert(p3.nth(x4, 2) == 3)
      assertThrows[NoSuchElementException] {
        p3.nth(x1, 3)
      }
    }
  }

  test("p4") {
    new testLists {
      assert(p4.length(x4) == 5)
      assert(p4.length(x2) == 0)
    }
  }

  test("p5") {
    new testLists {
      assert(p5.reverse(x4) == x4.reverse)
      assert(p5.reverse(List()) == List())

    }
  }

  test("p6") {
    new testLists {
      assert(p6.isPalindrome(x5))
      assert(p6.isPalindrome(x6))
      assert(!p6.isPalindrome(x4))
    }
  }
}
