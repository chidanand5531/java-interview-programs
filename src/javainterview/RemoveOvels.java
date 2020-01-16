package javainterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveOvels {

	public static void main(String[] args) {

		String st = "Bangalore";
		String s2="";
		for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i)!='l' && st.charAt(i)!='o' ) {
				s2= s2+st.charAt(i);
			}
		}
     System.out.println(s2);
	}
	/*
	 * String str1 = str.replaceAll("[a]", ""); System.out.println(str1); //
	 * OutPut:Bnglore String str3 = str.replaceAll("[lo]", "");
	 * System.out.println(str3); // OutPut:Bangare
	 */

}
