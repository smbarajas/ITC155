import java.util.*;

class Main {
  public static void main(String[] args) {
    Integer List1[] = new Integer[] { 1, 2, 3, 4, 5, 17, 10, 10 };
    Integer List2[] = new Integer[] { 1, 2, 3, 4, 5, 17, 10, 10 };
    System.out.println(replaceAll(List1, 10, 1));
    System.out.println(replaceAll(List2, 2, 19));
  }

  private static List replaceAll(Integer [] array, int x, int y){
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
    Collections.replaceAll(list, x, y); 
    return list;
  }

}
