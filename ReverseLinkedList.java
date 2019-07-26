package practice;
import java.util.*;

public class ReverseLinkedList {

	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList){
		
		for(int i=0;i<linkedList.size()/2;i++) {
			Integer temp = linkedList.get(i);
			linkedList.set(i, linkedList.get(linkedList.size()-i-1));
			linkedList.set(linkedList.size()-i-1, temp);
		}
		
		return linkedList;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(26);
		linkedList.add(23);
		linkedList.add(2833);
		linkedList.add(2833);
		linkedList.add(2834453);
		linkedList.add(2833);
		linkedList.add(2435833);
		linkedList.add(283243);
		linkedList.add(283663);
		linkedList.add(24833);
		linkedList.add(24354833);
		linkedList.add(2836453);
		linkedList.add(2854333);
		System.out.println("Elements before reversing" + linkedList);
		linkedList = reverseLinkedList(linkedList);
		System.out.println("Elements after reversing" + linkedList);
	}
}
