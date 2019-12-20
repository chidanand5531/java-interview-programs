package javaprograms2;

public class Recursion_Febonacci {

	static int a=0, b=1, c;
	public static void main(String[] args) {
		System.out.print(a +" "+ b);
		printfibonacciNo(10);
		
	}
	
/*	public static int febonacciNo(int num) {
		if(num<=1) {
			return num;
		}else {
			return (febonacciNo(num-1)+febonacciNo(num-2));
			
		}
	}*/

	
	public static void printfibonacciNo(int i) {
	
		 if(i>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			printfibonacciNo(i-1);
		 }
	}
}
