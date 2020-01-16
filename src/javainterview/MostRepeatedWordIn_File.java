package javainterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedWordIn_File {
	
	/*	i have declared LinkedHashMap containing String as a key and occurrences as  a value.
	 * Creating BufferedReader object
	 * Reading the first line into currentLine
	 * Declere while-loop & splitting the currentLine into words
	 * iterated using for loop. Inside for loop, i have an if else statement
	 * If word is present in Map increment it's count by 1 else set to 1 as value
	 * Reading next line into currentLine
*/

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("F:\\chidanand\\javaIO\\Student.txt"));
			  String currentLine = reader.readLine();
			while (currentLine!= null) {
				String[] input = currentLine.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");
                  for (int i = 0; i < input.length; i++) {
					if (map.containsKey(input[i])) {
						int count = map.get(input[i]);
						map.put(input[i], count + 1);

					} else {
						map.put(input[i], 1);
					}

				}
                   currentLine = reader.readLine();
			}

			String mostRepeatedWord = null;
             int count = 0;
				 for (Entry<String, Integer> m:map.entrySet())
		            {
		                if(m.getValue() > count)
		                {
		                   mostRepeatedWord = m.getKey();
		                     
		                    count = m.getValue();
		                }
		            }
			
				 System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
	             
		            System.out.println("Number Of Occurrences : "+count);
				 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
