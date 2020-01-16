package javainterview;

import java.awt.print.Printable;
import java.util.Arrays;

public class MissingNumbersDupli {
	
/*	First  get the highest no in array 
	Create new array of size Largest + 1
  if Number is present in array Assign Number position=1 , if Number not present(Assign 0). [0[0] 1[1] 2[0] 3[1] 4[0] 5[1]];
  
	*/

	public static void main(String[] args) {
		int a[] = {  3, 1, 5, 5 };

		// get the highest no in array
		int Largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Largest) {
				Largest = a[i];
			}
		}
		System.out.println("Largest no in given array -->" + Largest);

		int b[] = new int[Largest + 1];
		for (int i : a) {
			b[i] = 1;
		}

		System.out.print("Missing no are------->");
		for (int j = 1; j < b.length; j++) {
			if (b[j] == 0) {

				System.out.print(" " + j);
			}
		}

	}

}
