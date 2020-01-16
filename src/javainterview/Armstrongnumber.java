package javainterview;

public class Armstrongnumber {

	public static void IsArmstrongno(int num) {
		System.out.println("Given number is: " + num);
		int cube = 0;
		int r;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);  //[(1*1*1)+(5*5*5)+(3*3*3)]
		}
		if (t == cube) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("Not Armstrong no");
		}

	}

	public static void main(String[] args) {
		IsArmstrongno(153);
		IsArmstrongno(370);
	}

}
