package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesArray_UsingHashing {
	public static void main(String[] args) {
		int arr[] = {10,-1,-1,-1,20,89,2,2,2,2,2,2,2,3,4,4,4,4,4};
		printDuplicates(arr);
	}
	public static void printDuplicates(int[] arr) {
		Map<Integer,Integer> duplicateMap = new HashMap<>();
		int count = 0;
		boolean duplicate = false;
		for(int i=0;i<arr.length;i++) {
			if(duplicateMap.containsKey(arr[i])) {
				count = duplicateMap.get(arr[i]);
				duplicateMap.put(arr[i],count+1);
			}
			else {
				duplicateMap.put(arr[i],1);
			}
		}
		for(Entry<Integer,Integer> entry:duplicateMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" ");
				duplicate = true;
			}
		}
		if(!duplicate) {
			System.out.println("No duplicates present");
		}
	}
}
