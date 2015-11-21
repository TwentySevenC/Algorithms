package crackingcoding.arraysandstrings;



/**
 * Cracking the Coding Interview
 * @author liujian
 * 
 * Arrays and Strings
 * 
 * 1.5 Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become 
 * a2b1c5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 *
 */

public class StringCompression {
	
	public static String compression(String s){
		if(s.equals(""))
			return s;
		
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int num = 0;
		
		sb.append(c);
		
		for(int i = 0; i < s.length(); i++){
			if(c != s.charAt(i)){
				sb.append(num);
				c = s.charAt(i);
				sb.append(c);
				num = 0;
			}
			num ++;
		}
		
		if(num != 0)
			sb.append(num);
		
		String convert = sb.toString();
		
		if(convert.length() >= s.length()){
			return s;
		}
		
		return convert;
	}
	
	
	/** Count the length of converted string */
	public static int count(String s){
		
		if(s.equals(""))
			return 0;
		
		char c = s.charAt(0);
		int num = 1;            /** string length */
		int repeats = 0;          /** Number of the same char */
		for(int i = 0; i < s.length(); i++){
			if(c != s.charAt(i)){
				c = s.charAt(i);
				num += 1 + String.valueOf(repeats).length();
				repeats = 0;
			}
			repeats++;
		}
		
		num += String.valueOf(repeats).length();
		return num;
	}
	
	
	public static String compression2(String s){
		int count = count(s);
		if(count > s.length() || count == 0)
			return s;
		
		char[] chars = new char[count];
		char c = s.charAt(0);
		int repeats = 0;
		int index = 0;
		chars[index++] = c;
		
		for(int i = 0; i < s.length(); i++){
			if(c != s.charAt(i)){
				index = addRepeatsNum(chars, repeats, index);
				c = s.charAt(i);
				chars[index++] = c;
				repeats = 0;
			}
			repeats++;
		}
		
		if(repeats > 0)
			addRepeatsNum(chars, repeats, index);
		
		return new String(chars);
	}
	
	public static int addRepeatsNum(char[] a, int num, int index){
		for(char c : String.valueOf(num).toCharArray()){
			a[index++] = c;
		}
		
		return index;
	}
	
	
	public static void main(String[] args) {
		System.out.println(compression(""));
	}
}
