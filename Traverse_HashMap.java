package practice;

import java.util.*;

public class Traverse_HashMap {

	public static void main(String[] args) {
	
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("1235",1);
		hm.put("1235334",10);
		hm.put("1234245",11);
		hm.put("12424235",12);
		
		//printing the hashmap
		
		System.out.println(hm);
		
		Iterator i = hm.entrySet().iterator();
		
		//adding another value
		
		while(i.hasNext()) {
			
			Map.Entry mapElement = (Map.Entry)i.next();
			
			int value = ((int)mapElement.getValue() + 10);
			
			System.out.println(mapElement.getKey()+ ":"+value);
		}
	}

}
