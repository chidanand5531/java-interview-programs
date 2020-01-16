package javaprograms2;

import java.util.HashSet;

public class DuplicateInteger {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 3, 5, 3, 7, 89, 9, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + ",");
				}
			}

		}

		System.out.println();
/*		HashSet<Integer> store = new HashSet<Integer>();
		for (Integer dupli : a) {
			if (store.add(dupli) == false) {
				System.out.print(dupli+",");
			}
		}*/

	}

}
