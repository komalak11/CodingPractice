package practice;
//using hashing technique, divide the array into buckets depending on their divisible mod k

public class ArrayDivisiblePairs {
	static int divisiblePairs(int[] arr,int k) {
		//create a new array frequency to count occurrences of all remainders when divided with k
		int[] freq = new int[k];
		for(int i=0;i<arr.length;i++) {
			++freq[arr[i]%k];
		}
		int sum = freq[0]*(freq[0]-1)/2; //if both pairs are divisble by k
		//count for all i,i-k frequency of pairs
		for(int i=0;i<=k/2&&i!=(k-i);i++) {
			sum+=freq[i]*freq[k-1];
		}
		if(k%2==0) {
			sum+=(freq[k/2]*(freq[k/2]-1)/2);
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 7, 5, 3};
		int k = 3;
		System.out.println(divisiblePairs(arr,k));
	}

}
