package javainterview;

public class MissingNumber {

	public static void main(String[] args) {

		// int arr[]= {1,2,3,4,5,6.....100};
		// 1+2+4+5 = 12
		// 1+2+3+4+5 = 15
		// 15-12 = 3

		int a[] = { -1, 0, 1, 2,3, 4, 6, 7, 8 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) { // to add array numbers
			sum = sum + a[i];
		}

		System.out.println(sum);

		int sum1 = 0;
		for (int j = -1; j <= 8; j++) {  // to add complete sequence
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("Missing no is:" + (sum1 - sum));
	}

}
