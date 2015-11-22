package crackingcoding.arraysandstrings;

/**
 * Cracking the Coding Interview.
 * 
 * 1.8 Assume you have a method isSubstring which checks if one world
 * is a substring of another. Given two string s1 and s2,write code 
 * to check if s2 is a rotation of s1 using only one call to isSubstring
 * (e.g., "writerbottle" is a rotation of "erbottlewat")
 * 
 *
 */

public class RotationString {
	public static boolean isSubstring(String s1, String s2){
		return false;
	}
	
	public static boolean isRotationString(String s1, String s2){
		int length = s1.length();
		if(!(length == s2.length() && length > 0))
			return false;
		
		String s1s1 = s1 + s1;
		return isSubstring(s1s1, s2);
	}
}
