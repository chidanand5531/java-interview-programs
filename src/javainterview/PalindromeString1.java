package javainterview;

public class PalindromeString1 {

	public static void main(String[] args) {

		//String str = "malAyal aM";
		String str="too hot to Hoot";
		str = str.replace(" ", "").toLowerCase(); // space , without space

		int start = 0;
		int end = str.length() - 1; // 4

		boolean ispalindrome = true;

		while (end >start) {
			if (str.charAt(start) != str.charAt(end)) {
				 ispalindrome = false;
				break;
			}
			start++;
			end--;
		}

		if (ispalindrome) {
			System.out.println(" is palindrome");
		} else {

			System.out.println("not a palindrome");
		}

	}

}
