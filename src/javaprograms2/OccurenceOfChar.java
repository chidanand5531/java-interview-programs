package javaprograms2;

public class OccurenceOfChar {

	public static void main(String[] args) {
		
		String s="ahfsdkajs$jsja$klk$khm$";
		int count=0;
		for (char ch :s.toCharArray()) {
			if ( ch == '$') {
			count++;	
			}
		}
		System.out.println("Occurence of char $ is : "+count);
	
	}
}
