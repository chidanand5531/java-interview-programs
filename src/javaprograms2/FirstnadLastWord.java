package javaprograms2;

public class FirstnadLastWord {

	public static void FirstAndLast(String str) {

		System.out.print(str.charAt(0));
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)==' ') {
				System.out.print(str.charAt(i-1)+" "+str.charAt(i+1));
			}
		}
		System.out.print(str.charAt(str.length()-1));
		
	}

	public static void main(String[] args) {

		String str = "Hello How Are You";
		FirstAndLast(str);
	}

}
