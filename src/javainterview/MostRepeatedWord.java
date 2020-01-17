package javainterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedWord {

	public static void main(String[] args) {
		
		String[] str= {"ram","ravi","raj","ram","ram","chandra"};
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		for (int i = 0; i < str.length; i++) {
			if(map.containsKey(str[i])) {
				int count=map.get(str[i]);
				map.put(str[i], count+1);
			}else {
				map.put(str[i], 1);
			}
		}
		
		int count=0;
		String MostRepeatedWord="";
		for (Entry<String, Integer> m:map.entrySet()) {
			if(m.getValue()>count) {
				MostRepeatedWord=m.getKey();
				count=m.getValue();
			}
		}
		System.out.println("MostRepeatedWord : "+MostRepeatedWord);
		System.out.println("No of Occurence : "+count);
		
		

	}

}
