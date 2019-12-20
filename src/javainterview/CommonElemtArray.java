package javainterview;

public class CommonElemtArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 56, 7, 8, 34, 24, 78, 90 };
		int arr2[] = { 10, 2, 3, 5, 56, 7, 8, 324, 264, 78, 910 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print (+arr1[i]+" ");
				}

			}

		}

	}

}
