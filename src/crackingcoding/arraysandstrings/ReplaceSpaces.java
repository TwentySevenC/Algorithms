package crackingcoding.arraysandstrings;

/**
 * Cracking the Coding Interview
 * @author liujian
 * 
 * Arrays and Strings
 * 
 * 1.4 Write a method to replace all spaces in a string with '%20'.You may assume
 * that the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string.(Note: if
 * implementing in Java, please use a character array so that you can perform this 
 * operation in place.
 *
 */

public class ReplaceSpaces {
	
	public static void move(char[] array){
		
	}
	
	public static void replaceSpaces(String s){
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == ' '){
				move(chars);
			}
		}
	}

}
