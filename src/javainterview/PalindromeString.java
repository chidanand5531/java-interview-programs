package javainterview;

public class PalindromeString {

	public static void checkPalindrome(String str) {

		// reverse the given String

		String reverse = new StringBuffer(str).reverse().toString();

		// check whether the string is palindrome or not
		if (str.equalsIgnoreCase(reverse)) {

			System.out.println("Given string is Palindrome");

		} else {
			System.out.println("Given string is Not Palindrome");
		}
	}


	public static void main(String[] args) {

		checkPalindrome("malayalam");
		checkPalindrome("leveL");
		checkPalindrome("Nitin");
		checkPalindrome("too hot to hoot");
	}
}