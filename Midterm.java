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
