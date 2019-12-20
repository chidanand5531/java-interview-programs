package javainterview;

public class StringManiopulation {

	public static void main(String[] args) {

		String str = "the rains have started here";
		String str1 = "the rains Have started here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("s"));// first occurence of s

		System.out.println(str.indexOf("s", str.indexOf("s") + 1));// second occurence of s

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("Hello")); // hello is not thre it will return -1

		// string comparison:

		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));

		// substring :

		System.out.println(str.substring(0, 9));

		// trim: before and after space

		String s = "  hello word  ";

		System.out.println(s.trim());

		System.out.println(s.replace(" ", ""));

		String date = "01-01-2019";

		System.out.println(date.replace("-", "/"));

		// split:
		String test = "hello-worl-test-selenium";
		String testval[] = test.split("-");
		for (int i = 0; i < testval.length; i++) {
			System.out.print(testval[i]+" ");
		}
		
		String x = "hello";
		String y = "world";
		int a = 10;
		int b = 20;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));

	}

}
