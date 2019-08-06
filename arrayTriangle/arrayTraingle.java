package practice;

import java.util.Arrays;

public class arrayTriangle {
	public static void createTriangle(int[] arr) {
		if(arr.length<1)
			return;
		int[] temp = new int[arr.length -1];
		for(int i=0;i<arr.length-1;i++) {
			int x = arr[i]+arr[i+1]; //add consecutive elements in the array
			temp[i] = x; // store it in the new array
		}
		createTriangle(temp);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,-1,-9,-8};
		createTriangle(arr);
	}
}
