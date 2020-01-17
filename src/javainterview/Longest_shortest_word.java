package javainterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Longest_shortest_word {

	public static void main(String[] args) {

		// String s = "My name is java Arun ramanarayana rajpaksha";
		String s = "i india love my  ";
		/*
		 * List<String> words = Arrays.asList(s.split(" ")); String shortestWord =
		 * words.stream().min( Comparator.comparing(word -> word.length())).get();
		 * 
		 * 
		 * System.out.println("shortestWord in String :"+shortestWord);
		 * 
		 * List<String> wordsL = Arrays.asList(s.split(" ")); String LongeststWord =
		 * wordsL.stream().max( Comparator.comparing(word -> word.length())).get();
		 * System.out.println("LongeststWord in String :"+LongeststWord);
		 */

		String[] str = s.split(" ");

		String FirstWord = "";
		String SecondWord = "";

		for (int i = 0; i < str.length; i++) {
			if (FirstWord == null && SecondWord == null) {
				FirstWord = str[i];
				SecondWord = str[i];

			} else if (FirstWord.length() < str[i].length() && str[i].length() > SecondWord.length()) {
				SecondWord = FirstWord;
				FirstWord = str[i];

			} else if (str[i].length() > SecondWord.length() && str[i].length() != FirstWord.length()) {
				SecondWord = str[i];

			}

		}
		System.out.println("FirstWord largest word : " + FirstWord + "=" + FirstWord.length());
		System.out.println("SecondWord largest word : " + SecondWord + "=" + SecondWord.length());

	}

}
