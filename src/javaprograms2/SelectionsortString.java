package javaprograms2;

import java.util.Arrays;

public class SelectionsortString {

	public static void main(String[] args) {

		String a[] = { "sai", "ram", "guru", "naveen", "vasu", "amit", "chandu" };
		String temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

//		 Arrays.sort(a);
//		 System.out.print(Arrays.toString(a));

	}

}
