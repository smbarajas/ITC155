/*
Wrote a method called "MaxOccurances" which accepts a list of integers as a parameter and returns the number of times
the most frequently occuring integer occurs in the list. If the list is empty, it will return 0.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(1, 1, 1, 1, 1);
    List<Integer> list3 = Arrays.asList(1, 5, 3, 5, 5);
    List<Integer> list4 = Arrays.asList();
    System.out.println(maxOccurrences(list1));
    System.out.println(maxOccurrences(list2));
    System.out.println(maxOccurrences(list3));
    System.out.println(maxOccurrences(list4));
  }
  
  public static int maxOccurrences(List<Integer> list) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int modeVal = 0;
    for(int n : list) { 
      if(map.containsKey(n)) {
        map.put(n, map.get(n) + 1);
      } else {
        map.put(n, 1);
      }
      if(map.get(n) > modeVal)
        modeVal = map.get(n);
    }
    return modeVal;
    }
}


/*
2: The output that would be produced by the method by the ArrayLists would be:
[1,2,6,8]
[10,20,30,60,50,40]
[-4,1,9,16,25,36,49,64]

3: The value that is returned for mystery3(6) is 6, and the value that would be returned for mystery3(17) would be about 9, 
even though I'm pretty sure it would actually be 8.7, it's calling for an int, so I rounded.

*/
