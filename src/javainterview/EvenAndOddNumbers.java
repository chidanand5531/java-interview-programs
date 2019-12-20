package javainterview;

public class EvenAndOddNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Numbers are:" + i);
			}else {
				System.out.println("odd Number"+i);
			}
		}
		
		System.out.println("*************");
		// for odd numbers
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				System.out.println("Odd Numbers are:" + i);
//			}
//		}

	}
}
