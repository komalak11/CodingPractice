//PLEASE TELL ME THE TIME COMPLEXITY OF THIS PROGRAM

package practice;

import java.util.*;

public class StringDuplicate_HashMap {
	
	public void findChar(String str) {
		
		HashMap<Character,Integer> baseMap = new HashMap<Character,Integer>();
		
		char[] charArr = str.toCharArray();
		
		for(Character c:charArr) {
			
			if(baseMap.containsKey(c)) {
				
				baseMap.put(c,baseMap.get(c)+1);
			}
			
			else {
				
				baseMap.put(c, 1);
			}
		}
	
		HashSet<Character> keys = new HashSet<Character>();
		
		for(Character c:keys) {
			
			if(baseMap.get(c)>1) {
				
				System.out.println("The valus is repeated" + baseMap.get(c));
			}
		}
	}
	
	public static void main(String[] args) {
		
		StringDuplicate_HashMap sd = new StringDuplicate_HashMap();
		
		sd.findChar("AAAAAAAAAAAAAAAAAA");
	}

}
