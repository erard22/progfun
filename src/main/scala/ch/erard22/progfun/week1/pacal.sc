
/*

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

pascal(0,2)=1
pascal(1,2)=2
pascal(1,3)=3

*/


def pascal(c: Int, r: Int): Int = {
  if (c == 0 || c == r) 1
  else pascal(c-1, r-1) + pascal(c, r-1)
}

pascal(0,0)
pascal(0,2)
pascal(1,2)
pascal(1,3)



