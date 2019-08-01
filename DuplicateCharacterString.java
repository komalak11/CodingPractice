package practice;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateString {
	
	//create a hashmap to put character and string in a map
	public static void printDuplicateCharacters(String str) {
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] characters = str.toCharArray();
		for(Character c:characters) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
		}
		//Iterate through the hashmap to print all the duplicate string
		Set<HashMap.Entry<Character,Integer>> entrySet = charMap.entrySet(); //entryset to the charmap created
		System.out.println("List of duplicate character in a string "+str);
		for(Map.Entry<Character,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
				System.out.println("Duplicate character "+entry.getKey()+" is repeated "+entry.getValue()+" times");
			}
			else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter string value");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		printDuplicateCharacters(str);
	}

}
