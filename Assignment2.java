/*
Wrote a method removeEvenLength that removes all of the strings of even length from the list. 
*/

import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

 
class Main
{

  public static void main(String[] args) {
    System.out.println("Testing iterator");
 


	// Adding in the iterator
	List<Integer> numbers = new ArrayList<Integer>();
	
	//Adding numbers
	numbers.add(11);
	numbers.add(45);
	numbers.add(12);
	numbers.add(32);
	numbers.add(36);

	//print the list
	System.out.println("Unsorted List: " + numbers);
	
	for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
    Integer number = iterator.next();
    if (number % 2 == 0) {
        System.out.println("This is Even Number: " + number);
        iterator.remove();
    }

}

Collections.sort(numbers);
System.out.println("Sorted List: " + numbers);



	}
}
