package practice;

import java.util.Arrays;

public class ArrayAtleastTwoGreaterNumbers {
	public static void findGreaterNumbers(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = { 2, -6 ,3 , 5, 1};
		findGreaterNumbers(arr);
	}

}
