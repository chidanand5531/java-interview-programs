package javainterview;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1="gullu";
		String s2="uglul";
		
		char[] c1=s1.toCharArray();
		char[] c2=s1.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String s3=new String(c1);
		String s4=new String(c2);
		
		if (s3.equals(s4)) {
			System.out.println("Anagram");
		} else {
			System.out.println(" Not Anagram");

		}
	}

}
