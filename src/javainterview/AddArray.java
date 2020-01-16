package javainterview;

import java.util.Arrays;

public class AddArray {

	public static void main(String[] args) {
		
		long Sum = 0;
		String inputString = "20ab&050a 123FG$% 30";
		String[] output = inputString.replaceAll("[^0-9]", " " ).trim().split(" ");
		System.out.println(Arrays.toString(output));
		for(String str:output) {
			if(str.matches("[0-9]+")){  //public boolean matches(String regex) ie:  regular expression to which this string is to be matched
				Sum=Sum+Long.parseLong(str);
				
			}
		}

		System.out.println("sum of numebrs is : " + Sum);// 223
	}
}
