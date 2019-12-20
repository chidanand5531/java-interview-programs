package javaprograms2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence_Of_Digits {

	public static void main(String[] args) {
		
		int[] input = { 2,1,7,5,7,1,3,2 };
		
		Map<Integer,Integer> map=new LinkedHashMap<>(); //LinkedHashMap maintains insertion order of elements
		for(int i=0; i<input.length; i++) {   
			if(map.containsKey(input[i])) {
				int count=map.get(input[i]);
				map.put(input[i], count+1);
			}else {
				map.put(input[i], 1);
			}
			
		}
		//System.out.println(map);
	    for (Map.Entry m : map.entrySet()) {
	        System.out.print(m.getKey()+":"+ m.getValue()+ " ");
	      }
	   
	}

	}

