package practice;

import java.util.*;

public class StringReverseWords_Stack {
	
	static String ReverseWords(String str) {
		
		Stack<Character> s = new Stack<Character>();
		
		char[] c = str.toCharArray();
		
		//pushing them into a stack char wise until we encounter a space
		
		for(int i=0;i<str.length();i++) {
			
			if(c[i] != ' ') {
				
				s.push(c[i]);
			}
			
			//when we see a space then we pop the contents of the stack
			
			else {
				
				while(!s.isEmpty()) {
					
					System.out.print(s.pop());
				}
				
				System.out.println(" ");
			}
			
		}
		
		//the last word will not have space
		
		while(!s.isEmpty()) {
			
			System.out.print(s.pop());
		}
		
		return str;
	}

	public static void main(String[] args) {
		
		//StringReverseWords_Stack str = new StringReverseWords_Stack();
		
		String str = "What is love?";
		
		str = ReverseWords(str);

	}

}
