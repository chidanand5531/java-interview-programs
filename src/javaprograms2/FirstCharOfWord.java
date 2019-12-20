package javaprograms2;

public class FirstCharOfWord {

	public static void main(String[] args) {

		String str = "Hi chidanand how are you";
		
		System.out.print(str.charAt(0)+" ");
		for (int i = 0; i < str.length()-1; i++) {
			if  (str.charAt(i) == ' ')
				System.out.print(str.charAt(i+1)+ " ");
		}
	}

}
