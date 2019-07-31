package practice;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharString {
	public static void isCharRepeating(String str) {
		HashMap<Character,String> isCharNotRepeating = new HashMap<Character,String>();
		for(int i=0;i<str.length();i++) {
			char toChar = str.charAt(i);
		if (isCharNotRepeating.containsKey(toChar)) {
			isCharNotRepeating.put(toChar, isCharNotRepeating.get(toChar)+1);
		}
		else {
			isCharNotRepeating.put(toChar,"1");
		}
	}
		for(int i=0;i<str.length();i++) {
			char toChar = str.charAt(i);
			if(toChar == 1) 
			System.out.println("First non repeating charater is "+str.charAt(toChar));			
		}
		//return 0;
}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str = input.next();
	isCharRepeating(str);
	//System.out.println("First non repeating charater is "+str.charAt(isCharRepeating(str)));
	}
}
