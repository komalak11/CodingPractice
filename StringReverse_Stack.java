//TIME COMPLEXITY??

package practice;

import java.util.*;

public class StringReverse_Stack {
	
	public static String Reverse(String str) {
		
		if(str== null || str.equals("")) {
			
			System.out.println("String is empty");
		}
		
		Stack <Character> s = new Stack<Character>();
		
		char[] c = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			
			//push every char in the string into a stack
			
			s.push(c[i]);
		}
		
		int k =0;
		
		//pop from the stack until its empty
		
		while(!s.isEmpty()) {
			
			c[k++] =s.pop();
		}
		
		//conversion the char into a string
		
		return String.copyValueOf(c);
		
	}

	public static void main(String[] args) {
		
		String str = "Turn the radio on";
				
		str = Reverse(str);
		
		System.out.println("Reversed string is : "+ str);

	}

}
