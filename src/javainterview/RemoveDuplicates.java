package javainterview;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] nums= {2,3,4,5,7,3,4,2};
		nums=removeDup(nums);
		System.out.println(Arrays.toString(nums));
		
	}

	public static int[] removeDup(int[] nums) {
		  Arrays.sort(nums);
		  int x = 0;
		  for (int i = 0; i < nums.length; i++) {
		    if (i == 0 || nums[i] != nums[i - 1]) {
		    nums[x++] = nums[i];
		    }
		  }
		  return Arrays.copyOf(nums, x);
		}
}

