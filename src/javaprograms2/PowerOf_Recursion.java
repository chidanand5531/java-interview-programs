package javaprograms2;

public class PowerOf_Recursion {

	public static void main(String[] args) {
		
		System.out.println("Result of power "+power(3,4));

	}
	
	public static int power(int base,int num) {
		if(num!=0) {
			return base*power(base,num-1);
		}else{
			return 1;	
		}	
	}

}

/*power(3, 4) 4 3 * result2
power(3, 3)	  3	3 * 3 * result3                     it calls the method until it satisfies the condition again and again
power(3, 2)	  2	3 * 3 * 3 * result4
power(3, 1)	  1	3 * 3 * 3 * 3 * resultfinal
power(3, 0)	  0	3 * 3 * 3 * 3 * 1 = 81*/