package javainterview;

import java.util.Arrays;

public class AddNewArray {

	public static void main(String[] args) {

		int Sum = 0;
		String inputString = "ab&50 FG$% 30";

		String[] output = inputString.replaceAll("[^0-9]", " ").trim().split(" ");

		 System.out.println(Arrays.toString(output));// [50, 30]
		
		 for(String s:output) {
			 if(s.matches("[0-9]+")) {
				 Sum=Sum+Integer.parseInt(s);
			 }
		 }
		System.out.println("sum of numebrs is : " + Sum);// 80
	}

}
