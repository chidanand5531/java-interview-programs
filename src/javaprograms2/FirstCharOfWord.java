package javaprograms2;

public class FirstCharOfWord {

	static String str = "Hi chidanand how are you";
	public static void main(String[] args) {

		
		System.out.println(captializeAllFirstLetter(str));
/*		System.out.print(str.charAt(0)+" ");
		for (int i = 0; i < str.length()-1; i++) {
			if  (str.charAt(i) == ' ')
				System.out.print(str.charAt(i+1)+ " ");
		}
	}*/
	}
	
	public static String captializeAllFirstLetter(String name) 
    {
        char[] array = name.toCharArray();
        array[0] = Character.toUpperCase(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        return new String(array);
    }

}
