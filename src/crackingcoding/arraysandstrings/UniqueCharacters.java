package crackingcoding.arraysandstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Cracking the Coding Interview
 * @author liujian
 * 
 * Arrays and Strings
 * 
 * 1.1 Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */


public class UniqueCharacters {
	public static boolean unique(String str){
		List<String> chars = Arrays.asList(str.split(""));
		System.out.println(chars);
		Set<String> set = new HashSet<>();
		
		for(String c : chars){
			set.add(c);
		}
		
		return chars.size() == set.size();
	}
	
	public static void main(String[] args) {
		System.out.println(unique("qwertyuqbnmhgf"));
	}
}
