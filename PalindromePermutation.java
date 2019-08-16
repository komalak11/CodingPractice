package CTCI;

import java.util.HashSet;

public class PalindromePermutation {
	public static boolean checkPermutation(String s) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
	            if (!set.add(s.charAt(i)))
	                set.remove(s.charAt(i));
	        }
	        return set.size() <= 1;
	}
public static void main(String[] args) {
	String s = "tactcoa";
	System.out.println(checkPermutation(s));
	}
}
