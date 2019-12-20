package javaprograms2;

public class MoveZeroesAtend {
	// 1. inputArray is the given array. It contains both zero and non-zero values.
	
	// 3. Iterate through the array one by one element.
	// 4. Check if the current element is non zero or not. If non-zero, insert the
	// value to the position currentIndex. Increment the value of currentIndex.
	// 5. After all items are scanned, insert 0 to all remaining position of the
	// array.
	// 6. Finally, print out the array to the user.

	public static void main(String[] args) {
		int[] inputArray = { 3, 2, 1, 0, 4, 0, 0, 2, 7, 0, 50, 0, 6, 8, 9, 0, 9, 1, 0, 8, 5 };
		// 2. Initialize one integer value currentIndex with value as 0.
		int currentIndex = 0;

		// 4. Check if the current element is non zero or not. If non-zero, insert the value to the position currentIndex.
		//Increment the value of currentIndex.
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[currentIndex] = inputArray[i];
				currentIndex++;
			}
		}
		
		// 5. After all items are scanned, insert 0 to all remaining position of the array.
		while (currentIndex < inputArray.length) {
			inputArray[currentIndex] = 0;
			currentIndex++;
		}
	
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ",");
		}
	}

}
