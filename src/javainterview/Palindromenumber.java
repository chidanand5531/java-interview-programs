package javainterview;

public class Palindromenumber {

	// 151 78987 161
	public static void ispalindromenumber(int num) {

		System.out.println("Given number is:- " + num);
		int rem = 0;
		int sum = 0;
		

		int t = num;

		while (num > 0) {
			rem = num % 10; // get the remainder
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("palindromeNumber");

		} else {
			System.out.println("Not palindromeNumber");

		}

	}

	public static void main(String[] args) {

		ispalindromenumber(151);
		ispalindromenumber(145);
		ispalindromenumber(78987);
	}

}
