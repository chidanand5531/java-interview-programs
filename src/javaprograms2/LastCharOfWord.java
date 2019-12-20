package javaprograms2;

public class LastCharOfWord {

	public static void main(String[] args) {
		
		String str="hi chidanand how are you";
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)==' ') {
				//System.out.print(str.toUpperCase().charAt(i-1)+" ");
				System.out.print(str.charAt(i-1)+" ");
			}
		}
		//System.out.print(str.toUpperCase().charAt(str.length()-1));
		System.out.print(str.charAt(str.length()-1));
		
	}

}
