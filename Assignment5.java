/*
Wrote a method, writeNums, that accepts an integer parameter n and prints 
the first n integers starting with 1 in sequential order, separated by
commas.
*/

import java.util.*;

class Main {
public static void main(String[] args) {
System.out.println("Starting test.");
}
  public static void writeNums(int n){
    if (n<1){
      throw new IllegalArgumentException();
    } else if (n==1){
      System.out.print("1");
      }
      else {
        writeNums(n-1);
        System.out.print("," + n);
      }
  }
}
