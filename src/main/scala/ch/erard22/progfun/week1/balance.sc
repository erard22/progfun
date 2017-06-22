//(if (zero? x) max (/ 1 x))
//I told him (that it’s not (yet) done). (But he wasn’t listening)

//:-)
//())(

/*
chars.isEmpty: Boolean returns whether a list is empty
chars.head: Char returns the first element of the list
chars.tail: List[Char] returns the list without the first element
 */


def balance(chars: List[Char]): Boolean = {

  def balanceIter(rest: List[Char], openParantheses: Int): Boolean = {
    if (rest.isEmpty) {
      openParantheses == 0
    } else {
      val h = rest.head
      val openParanthesesRecalc = openParantheses + recalc(h)
      if (openParanthesesRecalc >= 0) balanceIter(rest.tail, openParanthesesRecalc)
      else false
    }
  }

  def recalc(current: Char): Int = {
    if (current == '(') 1
    else if (current == ')') -1
    else 0
  }

  balanceIter(chars, 0)
}


balance("(if (zero? x) max (/ 1 x))".toList)
balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
balance(":-)".toList)
balance("())(".toList)