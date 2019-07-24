package practice;

import java.util.*;

public class String_HashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		print(hm);
		
		hm.put("ABCDEF",1);
		hm.put("38798347923",8);
		
		System.out.println(hm.size());
		
		print(hm);
		
		//to find an element
		
		if(hm.containsKey("ABCDEF")) {
			
			Integer a = hm.get("ABCDEF");
			
			System.out.println("Value is" + a);
		}
		
		hm.clear();
		print(hm);
		
	}
	
	public static void print(HashMap<String,Integer> hm) {
		
		System.out.println(hm); 
	
	}
	
}
