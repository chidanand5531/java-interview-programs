package javainterview;

import java.util.Arrays;
import java.util.HashSet;

/*1.Find Largest no and create an array of size Largest+1 
 2. Add all numbers from the 1 to till largest in set
3. Iterates through the array and remove every item of the array from the set.
4. Prints the remaining items in the set, which are all the missing items of the array.*/

public class MissingNoHashSet {

	public static void main(String[] args) {
		
		int numbers[] = { 3, 1, 5, 5 };
		
		int Largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > Largest) {
				Largest = numbers[i];
			}
		}
		System.out.println("Largest no in given array -->" + Largest);
		
		HashSet<Integer> set = new HashSet<Integer>();

		int arr[] = new int[Largest+1];
		
		 for (int i = 1; i < arr.length; i++) {
		 set.add(i);
		 }

		for (int j = 0; j < numbers.length; j++) {
			set.remove(numbers[j]);
		}

		System.out.println("Missing  no are :");
		for (int x : set) {
			System.out.print(x + " ");
		}
		
	}
}
