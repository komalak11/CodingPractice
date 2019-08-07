package practice;

import java.util.Arrays;

public class PairsWithSumLessThanNumber {
	static int findPairs(int[] arr,int n,int x) {
		int l = 0;
		int r = n-1;
		int result = 0;
		while(l<r) {
			if(arr[l]+arr[r]<x) {
				result = result+(r-1);
				l++;
			}
			else {
				r--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		int n = arr.length;
		int x = 8;
		System.out.println(findPairs(arr,n,x));
	}
}
