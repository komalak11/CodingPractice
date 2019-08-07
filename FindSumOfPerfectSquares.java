package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindSumOfPerfectSquares {
	public static ArrayList<Integer> getPefectSquares(int n){
		ArrayList<Integer> perfectSquares = new ArrayList<Integer>();
		int current = 1;
		int i =1;
		while(current<=n) {
			perfectSquares.add(current);
			current = (int)Math.pow(++i, 2); //finding the square of the number
		}
		return perfectSquares;
	}
	//Function to print the sum of the maximum two elements in an array
	public static int maxPairSum(int[] arr) {
		int max,secondMax;
		if(arr[0]>arr[1]) {
			max = arr[0];
			secondMax = arr[1];
		}
		else {
			max = arr[1];
			secondMax = arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				secondMax = max;
			}
			else if(arr[i]>secondMax) {
				secondMax = arr[i];
			}
		}
		return max+secondMax;
	}
	//Function to give the count of numbers that when added with n give a perfect square
	public static int countPairsWith(int n,ArrayList<Integer>perfectSquares,HashSet<Integer> num) {
		int count = 0;
		for(int i=0;i<perfectSquares.size();i++) {
			int temp = perfectSquares.get(i)-n;
			//temp>n is checked so that only a single pair is counted
			if(temp>n&&num.contains(temp)) {
				count++;
			}
		}
		return count;
	}
	//Function to count the number of pairs whose sum is a perfect square
	public static int countPairs(int[] arr) {
		int n = arr.length;
		int max = maxPairSum(arr); //Sum of maximum two elements in the array
		ArrayList<Integer> perfectSquares = getPefectSquares(max); //list of all the perfect squares up to max
		HashSet<Integer> num = new HashSet<Integer>();//Contains all array elements
		for(int i =0;i<arr.length;i++) {
			num.add(arr[i]);
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			count+=countPairsWith(arr[i],perfectSquares,num);
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,1,2,3,4,6,7,8};
		Arrays.sort(arr);
		System.out.println(countPairs(arr));
	}
}
