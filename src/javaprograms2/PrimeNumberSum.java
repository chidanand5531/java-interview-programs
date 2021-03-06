package javaprograms2;


	public class PrimeNumberSum {

	    public long sum(int limit){
	        int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < limit){
	            if(isPrimeNumber(number)){
	                sum += number;
	                count++;
	            }
	            number++;
	        }
	        return sum;
	    }

	    private boolean isPrimeNumber(int number){

	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String args[]){
	        PrimeNumberSum primeNumberSum = new PrimeNumberSum();
	        System.out.println(primeNumberSum.sum(100));
	    }

	}

