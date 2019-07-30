package practice;

import java.util.Scanner;

public class SumofEvenOdd_Arrays {
	
	public static void evenOdd(int[] arr) {
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				evenSum+=arr[i];
			}
			else {
				oddSum+=arr[i];
			}
		}
		System.out.println("Even sum"+evenSum);
		System.out.println("Odd sum"+oddSum);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[1500];// Initialize variable
		for(int i=0;i<arr.length;i++) {
			//arr[i] = input.nextInt();
			arr[i] = i;
		}
		evenOdd(arr);
	}
}
