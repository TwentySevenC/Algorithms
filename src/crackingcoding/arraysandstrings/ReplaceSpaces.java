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
	
	public static void move(char[] array, int index, int length){
		for(int i = length-1; i > index; i--){
			array[i + 2] = array[i];
		}
	}
	
	public static String replaceSpaces(String s, int length){
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == ' '){
				move(chars, i, length);
				length = length + 2;          //填充后实际长度开始变长
				chars[i++] = '%';
				chars[i++] = '2';
				chars[i] = '0';
			}
		}
		
		return new String(chars);
	}
	
	public static void main(String[] args) {
		String s = "How are  ";
		System.out.println(replaceSpaces(s, 7));
	}

}
