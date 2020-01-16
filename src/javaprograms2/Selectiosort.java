package javaprograms2;

import java.util.Arrays;

public class Selectiosort {

	public static void main(String[] args) {
		
		int a[]= {12,-2,-6,2,7,8,9,3};
		int temp;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		
/*		Arrays.sort(a);
	 System.out.print(Arrays.toString(a));
	}*/
	}
}
