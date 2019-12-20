package javainterview;

public class reverseInteger {

	public static void main(String[] args) {

		int num = 123456;
		int rev = 0;
		int rem = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem; // 0*10 + (123456/100)*10; = 0 + 6 ----> only remainder
			num = num / 10; // 123456/10
		}
		System.out.println(rev);

		// using stringbuffer
		long num1 = 12345678;
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		StringBuffer str=new  StringBuffer(String.valueOf(num1));
		str.reverse();
		System.out.println(str);
	}

}
