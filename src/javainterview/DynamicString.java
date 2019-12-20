package javainterview;

public class DynamicString {

	public static void main(String[] args) {
		String Str = "Cognizant is my company";
		String[] result = Str.split(" ");
		for(int i=0;i<result.length;i++)
		{	
			if (result[i].equalsIgnoreCase("Company")) {
				System.out.println(result[i]);
			}
		}

	}
}
