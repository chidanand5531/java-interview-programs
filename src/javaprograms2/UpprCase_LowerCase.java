package javaprograms2;

public class UpprCase_LowerCase {

	/*
	 * input value is :String str=”KriSHnA” output value is String str=”kRIshNa”
	 */

	public static void main(String[] args) {
		reversCase("KriSHnA");

	}

	public static void reversCase(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == str.toUpperCase().charAt(i)) {
				newStr = newStr + str.toLowerCase().charAt(i);

			} else if (str.charAt(i) == str.toLowerCase().charAt(i)) {
				newStr = newStr + str.toUpperCase().charAt(i);
			}
		}
		System.out.println(newStr);
	}

}
