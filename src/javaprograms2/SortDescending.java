package javaprograms2;

import java.util.HashMap;
import java.util.Set;

public class SortDescending {

	public static void main(String[] args) {
		String s = "Automation string testing ";
		char[] c = { 'a', 'e', 'i', 'o', 'u' };
		String[] spl = s.split(" ");
		int count = 0;
		HashMap<Integer, String> hm = new HashMap<>();
		for (int i = 0; i < spl.length; i++) {
			count = 0;
			for (int j = 0; j < spl[i].length(); j++) {
				for (int k = 0; k < c.length; k++) {
					if (spl[i].toLowerCase().charAt(j) == c[k]) {
						count = count + 1;
					}
				}
			}
			hm.put(count, spl[i]);
		}
		String result = "";
		Set<Integer> st = hm.keySet();
		for (Integer m : st) {
			result = hm.get(m) + " " + result;
		}
		System.out.println(result);

	}

}
