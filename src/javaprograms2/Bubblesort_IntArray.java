package javaprograms2;

public class Bubblesort_IntArray {

	public static void main(String[] args) {

		int arr[] = { 5, -1,4,2,8 };

		System.out.print("Before sorting ---> ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.print("After sorting ---> ");
		bubbleSort(arr);

	}

	public static void bubbleSort(int arr[]) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
