package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Longest_shortest_word {

	public static void main(String[] args) {
	
		 String s= "Arun ramanarayana rajpaksha";
		 List<String> words = Arrays.asList(s.split(" "));
		 String shortestWord = words.stream().min(
		 Comparator.comparing(word -> word.length())).get();
		 
		 
		 System.out.println("shortestWord in String :"+shortestWord);
		 
		 List<String> wordsL = Arrays.asList(s.split(" "));
		 String LongeststWord = wordsL.stream().max(
		 Comparator.comparing(word -> word.length())).get();
		 System.out.println("LongeststWord in String :"+LongeststWord);

	}

}
