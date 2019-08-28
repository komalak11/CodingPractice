package practice;

import java.util.*;

public class PalindromicPartitions {
	public static void printAllPalindromes(String s) {
		int n = s.length();
		//To store all palindromic partitions
		ArrayList<ArrayList<String>> allPartitions = new ArrayList<>();
		//To store current palindromic partition
		Deque<String> currentPartition = new LinkedList<String>();
		//Call a recursive function to generate allPartitions
		allPalindromePartitions(allPartitions,currentPartition,0,n,s);
		//print all the palindrome partitions
		for(int i=0;i<allPartitions.size();i++) {
			for(int j=0;j<allPartitions.get(i).size();j++) {
				System.out.print(allPartitions.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static void allPalindromePartitions(ArrayList<ArrayList<String>> allPartitions,
			Deque<String> currentPartition,int start,int n,String input) {
		if(start>=n) {
			allPartitions.add(new ArrayList<String>(currentPartition));
			return;
		}
		//pick all possible ending points of the substring
		for(int i=start;i<n;i++) {
			if(isPalindrome(input,start,i)) {
				currentPartition.add(input.substring(start,i+1));
				allPalindromePartitions(allPartitions,currentPartition,i+1,n,input);
				//Remove substring str[start..i] from current partition
				currentPartition.removeLast();
			}
		}
	}
	public static boolean isPalindrome(String input,int start,int i) {
		while(start<i) {
			if(input.charAt(start++)!=input.charAt(i--)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "abba";
		System.out.println("All possible partitions for input string "+s+" are");
		printAllPalindromes(s);
	}
}
