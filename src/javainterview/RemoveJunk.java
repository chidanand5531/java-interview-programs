package javainterview;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		
		String s="%%$#$%@ latin string 0123456789 %$#$%";
		String s1 = "%^%$^&^123254str java selenium $%$#$#";
		
		//regular expresion: [^a-zA-Z0-9] it will retain all charecters
		// [a-zA-Z0-9]-----> Removes all charecters
		// storing this in same reference s string isimmutable object
		
		 s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1= s1.replaceAll("[^a-zA-Z0-9]", "");
	String s2 = s1.replaceAll("\\w+ ", "");
	     String s3 = s2.replaceAll("[^0-9]", "");
		System.out.println(s1);
		System.out.println(s3);
	}
	
/*	public static void main(String args[])
	{
		String text = "KRishNa"; //krISHnA
		text = text.replaceAll("KRishNa", "krISHnA");
		System.out.println(text);
		}*/ 
	}

	


