package javainterview;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//Integer[] nums= {2,3,4,5,7,3,4,2};
		//String str="seleniumsel";
		//char[] nums=str.toCharArray();
		String[] nums= {"name","aravind","gourav","name","akash"};
	
		System.out.println(Arrays.toString((removeDup(nums))));
		
	}

	public static Object[] removeDup(Object[] object) {
		  Arrays.sort(object);
		  int x = 0;
		  for (int i = 0; i < object.length; i++) {
		    if (i == 0 || object[i] != object[i - 1]) {
		    	object[x++] = object[i];
		    }
		  }
		  return Arrays.copyOf(object, x);// is used to copy the array content into new array of user specified length.
		}
}

