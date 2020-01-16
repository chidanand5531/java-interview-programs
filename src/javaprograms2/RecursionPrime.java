package javaprograms2;

public class RecursionPrime {

	public static void main(String[] args) {
		
		int num = 8;
		int prime = isPrime(num, num / 2);
		
		if (prime == 1) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}

	}

	public static int isPrime(int num, int i) {

		if (i == 1) {
			return 1;
		} else if (num % i == 0) {
			return 0;
		} else {
			return isPrime(num, i - 1);
		}
	}

}

/*i=n/2  5/2=2;    n=20
isprime(5,2)
if(2==1)  false     
	return 1;
if(5%2==0)  false     20%10==0  true
return 0;
return isPrime(5,1)*/
