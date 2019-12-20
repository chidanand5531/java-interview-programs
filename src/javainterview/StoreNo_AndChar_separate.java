package javainterview;

public class StoreNo_AndChar_separate {

	public static void main(String[] args) {
	
		String st = "abcd1234";
		String st1=st.replaceAll("[^A-Za-z]", "");
		String st2=st.replaceAll("[^0-9]", "");
		System.out.println("String b = "+st1);
		System.out.println("Int c = "+st2);

	}

}
