package javainterview;

public class ReverseString {

	public static void main(String[] args) {

		// there is no reverse function in string
		
		
		String s = "selenium";
		// 1. using for loop
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// using string buffer

		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
