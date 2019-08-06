package practice;

import java.util.HashMap;
import java.util.Map;

public class MaximizingElements {
	static int countMaxPosition(int [] arr) {
		int n = arr.length;
		HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
		for(int x:arr) {
			if(count.containsKey(x))
				count.put(x,count.get(x)+1);
			else
				count.put(x,1);
		}
		//find maximum frequency
		int max_Frequency = 0;
		for(Map.Entry entry : count.entrySet()) {
			max_Frequency = Math.max(max_Frequency, (int)entry.getValue());
		}
		return n-max_Frequency;
	}
public static void main(String[] args) {
	int[] arr = {10,27,-5,32,89,-1};
	System.out.println(countMaxPosition(arr));
	}
}
