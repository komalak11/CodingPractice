package practice;

public class InsertionSortLinkedList {	
	node head;
	node sorted;	
	class node{		
		int value;
		node next;
		public node(int value) {
			this.value = value;
		}
	}
	void push(int value) {
		//allocate node
		node newNode = new node(value);
		newNode.next = head;
		head = newNode;
	}
	//to sort the singly linked list
	void insertionSort(node headReference) {
		//Initialize sorted linked list
		sorted = null;
		node current = headReference;
		while(current!=null) {
			node next = current;
			sortedInsert(current);
			current = next;
		}
		head = sorted;
	}
	void sortedInsert(node newNode) {
		if(sorted == null || sorted.value>=newNode.value) {
			newNode.next = sorted;
			sorted = newNode;
		}
		else {
			node current = sorted;
			while(current.next != null || current.next.value<newNode.value) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	void printList(node head) {
		while(head != null) {
			System.out.print(head.value+" ");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		System.out.println("List before sorting");
		InsertionSortLinkedList linkedList = new InsertionSortLinkedList();
		linkedList.push(12);
		linkedList.push(1);
		linkedList.push(1872);
		linkedList.push(12);
		linkedList.printList(linkedList.head);
		linkedList.insertionSort(linkedList.head);
		System.out.println("List after sorting");
		linkedList.printList(linkedList.head);
	}
}
