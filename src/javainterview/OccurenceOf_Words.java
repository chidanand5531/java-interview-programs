package javainterview;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOf_Words {
	
	
	/*	i have declared HashMap containing String as a key and occurrences as  a value.
		iterated using for loop. Inside for loop, i have an if else statement
	If word is present in Map increment it's count by 1 else set to 1 as value
*/

	public static void main(String[] args) {
		
		String str="this is the first program this question is asked manytimes";
		String[] input=str.split(" "); //[this, is, the, first, program, this, question, is, asked, manytimes]
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0; i<input.length-1; i++) {   
			if(map.containsKey(input[i])) {
				int count=map.get(input[i]);
				map.put(input[i], count+1);
				
			}else {
				map.put(input[i], 1);
			}
			
		}
		
		System.out.println(map);//{the=1, question=1, asked=1, this=2, is=2, program=1, first=1}
		 
	    for (Map.Entry m : map.entrySet()) {
	        System.out.print(m.getKey()+":"+ m.getValue()+" ");//the:1 question:1 asked:1 this:2 is:2 program:1 first:1
	      }

	}

}

