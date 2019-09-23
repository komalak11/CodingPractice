//TELL ME WHY IT ISNT SORTING CORRECTLY
//Time complexity O(log n)
package practice;
//Program is for sorting using heap sort which uses a binary heap - which is a complete tree with only the last level not being filled 

public class HeapSort {
	public static void sort(int[] arr) {
		int n = arr.length;
		//build head (Rearrange heap)
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,i,0);
		}
	}
	public static void heapify(int[] arr,int n,int i) {
		int largest = i; //Initialize largest as the root
		int l = 2*i +1;
		int r = 2*i +2;
		if(l<n&&arr[l]>largest) {
			largest = l;
		}
		if(r<n&&arr[r]>largest) {
			largest = r;
		}
		if(largest!=i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr,n,largest);
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {9,2,3,5,1};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}
}
