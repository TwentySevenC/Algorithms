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
	
	public static boolean unique2(String str){
		if(str.length() > 256) return false;
		
		boolean[] flag = new boolean[256];
		
		for(int i = 0; i < str.length(); i++){
			int c = str.charAt(i);
			
			if(flag[c]){
				return false;
			}
			
			flag[c] = true;
		}
		
		return true;
	}
	
	
	//方法三： 采用一个int值的各位来标记存在的字符，假设只有a-z int 有4个字节，32位，足够标记26个字母
	public static boolean unique3(String str){
		int flag = 0;
		
		for(int i = 0; i < str.length(); i++){
			int num = 'a' - str.charAt(i);
			if((flag & (1 << num)) > 0){
				return false;
			}
			flag |= 1 << num;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(unique3("wertyuqbnmwhgf"));
	}
}
