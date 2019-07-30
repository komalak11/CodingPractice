package practice;

public class middleElementLinkedList {
	Node head; //head of the linked list
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void printMiddle() {
		Node slowPointer = head;
		Node fastPointer = head;
		if(head!=null) {
			while(fastPointer.next!=null && fastPointer.next.next!=null) {
				fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;
			}
			System.out.println("Middle element is" + slowPointer.data);
		}
		
	}
	public void push(int newData) {
		Node newNode = new Node(newData); //allocate a node and put in the data
		newNode.next = head; //make next of the new node as the head
		head = newNode; //move the head to point to the new node
	}
	public void printList() {
		Node tempNode = head;
		while(tempNode!=null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println("Null");
	}
	public static void main(String[] args) {
		middleElementLinkedList linkedList = new middleElementLinkedList();
		for(int i=0;i<10;i++) {
			linkedList.push(i);
		}
		linkedList.printList();
		linkedList.printMiddle();
	}
}
