def abs(x: Double): Double = if (x > 0) x else -x

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double): Boolean =
  abs(guess * guess -x) / x < 0.0001

def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2

def sqrt(x: Double): Double = sqrtIter(1, x)


def sqrt2(x: Double): Double = {

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double): Boolean =
    abs(guess * guess -x) / x < 0.0001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  sqrtIter(1.0)

}


sqrt(4)
sqrt2(4)