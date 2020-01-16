package javainterview;

public class SeperateNumbers {

	public static void main(String[] args) {

		String s = "Struggle12for5andind829";
		String s2 = "";

		String[] arr = s.split("[a-zA-Z]+");

		for (String s1 : arr) {

			s2 = s2 + s1.trim();
		
		}
		 System.out.println(s2);
		char[] ch = s2.toCharArray();

		for (Character c : ch) {
			System.out.print(c + ",");
		}

	}

}
