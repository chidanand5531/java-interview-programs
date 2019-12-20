package javainterview;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	/* function reverses the elements of the array */
	public static void reverse(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 60, 30, 40, 50 };
		reverse(arr);
	}
}
