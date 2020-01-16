package javaprograms2;

public class MoveZeoresAtEnd {

	public static void main(String[] args) {
		
		int[] inputArray = { 3, 2,0, 1, 0, 4, 0, 0, 2, 7, 0, 50, 0, 6, 8, 9, 0, 9, 1, 0, 8, 5 };
		
		int len=inputArray.length;
		int last_index = len -1;
		for (int i = 0; i < last_index; i++) {
			if (inputArray[i] == 0 && inputArray[last_index] == 0) {
				inputArray[i] = inputArray[last_index-1];
				inputArray[last_index-1] = 0;
				last_index -= 2;
			}else if (inputArray[i] == 0 && inputArray[last_index] != 0) {
				inputArray[i] = inputArray[last_index];
				inputArray[last_index] = 0;
				last_index--;
			}else if(inputArray[last_index] == 0){
				last_index--;
			}
			
		}
		for (int i = 0; i < len; i++) {
			System.out.print(inputArray[i] + " ");
		}

	}

}
