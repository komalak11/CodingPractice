package practice;

import java.util.ArrayList;

public class SubSequencesOfString {
	
	//utility function to print contents of the ArrayList
	static void printArrayList(ArrayList<String> arrayList) {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
	public static ArrayList<String> getSequence(String str){
		if(str.length() == 0) {
			//return empty arraylist
			ArrayList<String> emptyList = new ArrayList<String>();
			emptyList.add(" ");
			return emptyList;
		}
		char ch = str.charAt(0); //take first character of the string
		String subStr = str.substring(1); //creating sub string starting from the second character
		ArrayList<String> subSequences = getSequence(subStr);//recursive call
		ArrayList<String> resultString = new ArrayList<String>();
		for(String val:subSequences) {
			resultString.add(val);
			resultString.add(val+ch);
		}
		return resultString;
	}
	public static void main(String[] args) {
		String str = "why";
		printArrayList(getSequence(str));
	}
}
