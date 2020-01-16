package javainterview;

import java.util.Arrays;

public class AddCharNoArray {

	public static void main(String[] args) {
		long Sum = 0;
		String inputString = "20ab&050a 123FG$% 30";
		String[] output1 = inputString.replaceAll("[^0-9]", " ").trim().split(" ");
		 System.out.println(Arrays.toString(output1));

		for (int i = 0; i < output1.length; i++) {
			String s = output1[i];

			if (s.length() != 0) {
				Sum = Sum + Long.parseLong(output1[i]);

			}

		}

		System.out.println("sum of numebrs is : " + Sum);// 80

	}

}
