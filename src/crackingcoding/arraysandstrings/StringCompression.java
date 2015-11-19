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
	
	
	
	public static void main(String[] args) {
		System.out.println(compression("abbbcdqert"));
	}
}
