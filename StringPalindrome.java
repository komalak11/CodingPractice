package practice;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String str1,str2 = "";
		Scanner input = new Scanner(System.in);
		str1 = input.next();
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("String is palindrome");	
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
