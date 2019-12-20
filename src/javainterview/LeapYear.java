package javainterview;

public class LeapYear {

	public static void main(String[] args) {

		int year = 1800;

		if ((year % 400 == 0) || (year % 400 == 0) && (year % 100 == 0)) {

			System.out.println("given Year  " + year + " is leap year");
		} else {
			System.out.println("given Year  " + year + " is not leap year");

		}

	}

}
