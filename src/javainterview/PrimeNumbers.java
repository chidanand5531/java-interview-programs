package javainterview;

public class PrimeNumbers {

	// 2 is lowest prime no

	private static boolean isprimeno(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}

	private static void getPrimenumbers(int num) {

		for (int i = 2; i <= num; i++) {
			if (isprimeno(i)) {
				System.out.println(i +"");

			}

		}

	}

	public static void main(String[] args) {

		System.out.println("2 is prime number:- " + isprimeno(2));
		System.out.println("3 is prime number:- " + isprimeno(3));
		System.out.println("10 is prime number:- " + isprimeno(10));
		System.out.println("0 is prime number:- " + isprimeno(0));
		System.out.println("-2 is prime number:- " + isprimeno(-2));
		
		
		getPrimenumbers(20);
		getPrimenumbers(7);

	}

}
