package crackingcoding.arraysandstrings;

import java.util.Arrays;

/**
 * Cracking the Coding Interview
 * @author liujian
 *
 * Arrays and Strings
 * 
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other
 * 
 * 字母区分大小写, 空格也算字符里面
 * 
 */

public class OtherPermutation {
	
	/**
	 * Solution 1
	 */
	public static boolean permutation(String s1, String s2){
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}
	
	
	/**
	 *  Solution 2
	 */
	public static boolean permutation2(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		
		int[] number = new int[128];
		char[] array1 = s1.toCharArray();
		for(char c : array1){
			number[c]++;
		}
		
		for(char c : s2.toCharArray()){
			if(--number[c] < 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(permutation2("qwrt", "trwq"));
	}
}
