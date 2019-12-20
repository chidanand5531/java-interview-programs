package javainterview;

import java.util.HashSet;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String s="indonesiain";
		char[] ch=s.toCharArray();
		
		HashSet<Character> hs=new HashSet<Character>();
		System.out.print("duplicate charecters are :");
		for (Character c : ch) {
			if (hs.add(c)==false) {
				System.out.print(" "+c);
			}
		}

	}

}
