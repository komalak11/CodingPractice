package practice;

public class TwoSmallestElements {
	static void print2SmallestElements(int arr[]) {
		int first,second;
		if(arr.length<2) {
			System.out.println("Invalid input");
			return;
		}
		first = second = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second&&arr[i]!=first) {
				second = arr[i];
			}
		}
		if(second == Integer.MAX_VALUE) {
			System.out.println("There is no second element");
		}
		else {
			System.out.println("First element is "+first+" and second element is "+second);
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,5,8,9,0,17,3};
		print2SmallestElements(arr);
	}
}
