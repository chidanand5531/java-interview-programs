package javaprograms2;

import java.util.Arrays;

public class AlphabeticalOrder {

	public static void main(String[] args) {

		String str = "AcBCbDEdea";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		String sorted = new String(arr);
		System.out.println("Afert sorting : "+sorted);
		
		int len = arr.length;
		char temp[] = new char[len];

		int k = 0;
		for (int i = 0; i < len / 2; i++) {
			temp[k] = arr[i];
			temp[k + 1] = arr[(len / 2) + i];
			k += 2;
		}
		System.out.println(temp);

	}

}
