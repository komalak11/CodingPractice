package practice;

import java.util.Scanner;

public class PermutationofaString {
	public static void toFindPermutation(String str,int left,int right) {
		if(left == right) {
			System.out.println(str);
		}
		else {
			for(int i=left;i<right;i++) {
				str = swap(str,left,i);
				toFindPermutation(str,left+1,right);
				//str = swap(str,left,i);
			}
		}
		
	}
	public static String swap(String s,int i,int j) {
		char temp;
		char[] ch = s.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
		
	}
	public static int permutationNumber(String str) {
		int length = str.length();
		int sum = 1;
		for(int i=1;i<=length;++i) {
			sum*=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter the string for permutation");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println("Number of permutations are " +permutationNumber(str));
		toFindPermutation(str,0,str.length());
	}
	
}
