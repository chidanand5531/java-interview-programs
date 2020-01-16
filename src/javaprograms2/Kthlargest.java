package javaprograms2;

import java.util.Arrays;

public class Kthlargest {

	public static void main(String[] args) {

		int a[] = { 5, 8, 12, 7, 6, 2, 4, 5 };
		int k = 4;
		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

			if (i == k - 1) {
				System.out.println(k + "th largest element is --> " + a[i]);
				break;
			}

		}
		System.out.println(Arrays.toString(a));

	}

}
