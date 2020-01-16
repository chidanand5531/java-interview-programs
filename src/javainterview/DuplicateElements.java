package javainterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "java", "python", "Ruby", "javascript", "java", "c", "c" };

		// compare each element.....> worst approach

/*		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {

					System.out.println("Duplicate name is:" + names[i]);
				}
			}

		}*/
		
		// using HashSet :- it stores unique values
		System.out.print( "Duplicates  found are ---> ");
		Set<String> store = new HashSet<String>();
		for (String dupli : names) {
			if (store.add(dupli) == false) {
				System.out.print(dupli + ",");
			}
			
		}
		
		


	}

}
