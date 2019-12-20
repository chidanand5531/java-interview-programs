package javainterview;

import java.util.HashMap;
import java.util.Map;

public class Occurence_Of_Char {
		
/*		i have declared HashMap containing String as a key and occurrences as  a value.
		iterated using for loop. Inside for loop, we have an if else statement
	    If char is present in Map increment it's count by 1 else set to 1 as value
*/

	public static void main(String[] args) {
			
		String str="aravindr";
		//String str = "AAAABBCCCDDDDZZZZZAZBBB";
		String[] input=str.split(""); //[a, r, a, v, i, n, d, r]
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0; i<input.length; i++) {   
			if(map.containsKey(input[i])) {
				int count=map.get(input[i]);
				map.put(input[i], count+1);
			}else {
				map.put(input[i], 1);
			}
			
		}
		System.out.println(map);
	    for (Map.Entry m : map.entrySet()) {
	        System.out.print(m.getKey()+""+ m.getValue());
	      }

	}

}
