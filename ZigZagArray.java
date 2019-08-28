package practice;

import java.util.Arrays;

public class ZigZagArray {
	public static void arraySwap(int[] arr) {
	boolean flag = false;
	for(int i=0;i<arr.length-1;i++) {
		if(flag) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			else {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
			}
		flag = !flag;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,2,4,6,7};
		arraySwap(arr);
		System.out.println(Arrays.toString(arr));
	}
}
