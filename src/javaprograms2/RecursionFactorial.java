package javaprograms2;

public class RecursionFactorial {

	public static void main(String[] args) {
		
		System.out.println("Factorial of number : "+factorial(5));
		
	}
	
	public static long factorial(long num) {
		
		if(num<=1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}

}
/*5*4! --->5*24 =120
4*3! --->4*6 =24
3*2! --->3*2 =6 
2*1! --->2*1 =2
1!   --->1 */