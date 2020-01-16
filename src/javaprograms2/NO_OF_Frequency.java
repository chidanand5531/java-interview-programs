package javaprograms2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NO_OF_Frequency {

	public static void main(String[] args) {

		int num=21757132;
		
		 int[] input = new int[10];
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
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

