package practice;

import java.util.Arrays;

public class CountTripletsLessThanSumValue {
	static int countTriplets(int[] arr,int sum) {
		Arrays.sort(arr);
		int answer = 0;
		//Every iteration of loop counts triplets with first element
		for(int i=0;i<arr.length-2;i++) {
			//Initialize other two elements as corner elements of subarray
			int j = i+1;
			int k = arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>=sum) {
					k--;
				}
				else {
					answer+=(k-j);
					j++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,3,4,2,4,6,7,8};
		int sum = 7;
		System.out.println(countTriplets(arr,sum));
	}

}
