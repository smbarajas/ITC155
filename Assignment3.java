/* 
Wrote a method called isUnique that takes an array of integers as a parameter and 
returns a boolean value indicating whether or not the values in the array are unique.
(True for yes, false for no.)
*/

class Main {
  public static void main(String[] args) {
    int array1[]={1,2,3,4,5,6};
    int array2[]={33,15,18,33};
    System.out.println(isUnique(array1));
    System.out.println(isUnique(array2));
  }

  private static boolean isUnique(int [] array) {
    for (int i=0; i < array.length; i++){ 
      for (int j=i+1; j < array.length; j++){
        if (array[i] == array[j]){
          return false;
        }
      }
    }
    return true; 
  }
}
