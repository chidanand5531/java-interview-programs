package javainterview;

import java.util.Arrays;

public class LargestandSmallestno {

	public static void main(String[] args) {

		int numbers[] = { -24,-10, 1, 56, 87, 90190, 91898,0 };
		System.out.println("\n Givan array is:" + Arrays.toString(numbers));
		
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];

			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
			
			System.out.println("Largest no  is :"+largest);
			System.out.println("smallest no  is :"+smallest);
	}

}
