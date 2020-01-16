package javaprograms2;

public class BubbleSortString {

	public static void main(String[] args) {

		String arr[] = { "sai", "ram", "guru", "naveen", "vasu", "amit", "chandu" };
		bubbleSort(arr);
	}

	/*
	 * String temp;
	 * 
	 * for (int i = 0; i < a.length; i++) {
	 * 
	 * for (int j = 0; j < a.length-1-i; j++) { if (a[j].compareTo(a[j+1]) > 0) {
	 * temp=a[j]; a[j]=a[j+1]; a[j+1]=temp; } } } for (int i = 0; i < a.length; i++)
	 * { System.out.print(a[i]+ " "); }
	 * 
	 * }
	 */
	public static void bubbleSort(String arr[]) {

		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j-1] .compareTo(arr[j])>0) {
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
