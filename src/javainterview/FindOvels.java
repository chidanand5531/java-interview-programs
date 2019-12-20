package javainterview;

public class FindOvels {

	public static void main(String[] args) {

		String s = "india is great country";
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				counter = counter + 1;
			}
		}
		System.out.println("No of ovels in string are " + counter);
		

	}
/*	   public static void main(String[] args) {
		      String str = "AEAIOG";
		      LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
		      hMap.put('A', 0);
		      hMap.put('E', 0);
		      hMap.put('I', 0);
		      hMap.put('O', 0);
		      hMap.put('U', 0);
		      for (int i = 0; i <= str.length() - 1; i++) {
		         if (hMap.containsKey(str.charAt(i))) {
		            int count = hMap.get(str.charAt(i));
		            hMap.put(str.charAt(i), ++count);
		         }
		      }
		      System.out.println(hMap);
		   }    output = {A=2, E=1, I=1, O=1, U=0}*/

}
