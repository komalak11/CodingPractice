package practice;

import java.util.Scanner;

public class CheckPalindrome_Numbers {
	
	public static int reverseDigits(int number) {		
		int reverseNumber = 0;
		while(number>0) {
		reverseNumber = reverseNumber*10+number%10;
		number=number/10;
		}
		return number;
	}
	
	public static void isPlaindrome(int number) {
		int reverseNumber = reverseDigits(number);
		if(reverseNumber == number) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		isPlaindrome(number);
	}
}

