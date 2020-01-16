package javaprograms2;

import java.util.HashMap;
import java.util.Map;

public class A3b3c3d3a5 {

	public static void main(String[] args) {
		
/*		String str = "aaabbbcccdddaaaaa";
	    int count = 1;
//	    "$"---> it notifys for terminal condition. When it reaches to $,
//	    position it will calculate characters before it
	    char[] charArray = (str+"$").toCharArray();
	    
	    for (int i = 0; i < charArray.length - 1; i++) {
	      if (charArray[i] != charArray[i + 1]) {
	        System.out.print(charArray[i] + "" + count);
	        count = 1;
	      } else {
	        count++;
	        
	      }
	    }
	  }*/
	
    String s = "AAAABBCCCDDDDZZZZZAZBBB";
    int no = s.length();
    int it;
    Map<String, Integer> hm = new HashMap<String, Integer>();
    
    for (int i = 0; i < no; i++) {
      String ch = String.valueOf(s.charAt(i));
      if (hm.containsKey(ch)) {
        it = hm.get(ch);
      } else {
        it = 0;
      }

      hm.put(ch, ++it);  // starts from 0 pre-increment
    }
    for (Map.Entry m : hm.entrySet()) {
      System.out.print(m.getKey() +""+ m.getValue());
    }
  }


	}


