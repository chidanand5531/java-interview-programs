package javainterview;

public class DynamicString {

	public static void main(String[] args) {
		//String Str = "Cognizant is my company";
		String Str ="my name is sachin";
		String[] result = Str.split(" ");
		
		for(int i=0;i<result.length;i++)
		{	
			if (!result[i].equalsIgnoreCase("sachin")) {
				System.out.print(" "+result[i]);
			}
		}

	}
}
