/*
Wrote a method countUnique that takes a List of integers as a parameter and returns the number of unique integer 
values in the list.
/*

import java.util.*;

class Main {
  public static void main(String[] args) {
    Integer a1[] = new Integer[] { 1, 2, 3, 4, 5, 17, 10, 10 };
    Integer a2[] = new Integer[] { 1, 10, 10, 15, 20, 1, 5, 2 };  
    System.out.println(countUnique(a1));
    System.out.println(countUnique(a2));
  }

  private static int countUnique(Integer [] array){
    Set<Integer> setOfUniqueNumbers = new HashSet<>(Arrays.asList(array));
    return setOfUniqueNumbers.size();
  }
}
