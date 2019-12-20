package javainterview;

public class SwapWithThirdvar {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		// i want x=20 y=10
		
//		int t;
//		t=x; // t=10
//		x=y; // x=20
//		y=t; // y=10
		
//		System.out.println(x);
//		System.out.println(y);
		
		// withou using third variable
		
//		x=x+y;// x=30
//		y=x-y; // y=10
//		x=x-y; //x=20
//		
		//System.out.println(x);
		//System.out.println(y);

		// using * operator
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
