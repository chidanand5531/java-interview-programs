package javainterview;

public class strnglength {

	public static void main(String[] args) {

		String s = "chidanand";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(i);
//		}
		

		int i = 0;
		for (char c : s.toCharArray()) {
			i++;
		}
		System.out.println("length of string : " + i);
	}

}
