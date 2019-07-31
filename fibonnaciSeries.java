package practice;

import java.util.Scanner;

public class nthFibonacciSeries {
	public static int createSeries(int n) {
		int fib1 =0;
		int fib2 =1;
		int fib;
		System.out.print(fib1+","+fib2);
		if(n==0) {
			return fib1;
		}
		for(int i=2;i<=n;i++) {
			fib = fib1+fib2;
			fib1 = fib2;
			fib2 = fib;
			System.out.print(","+fib);
		}
		return fib2;
	}
	public static void main(String[] args) {
		System.out.println("Enter input value");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		createSeries(value);
	}
}
