package CTCI;

public class DeleteMiddleNode {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int newData) {
		Node newNode = new Node(newData) ;
		newNode.next = head;
		head = newNode;
	}
	public void deleteNode() {
		//traverse through the linked list with a fast pointer and slow pointer to find the middle node
		/*if(head == null) {
			return null;
		}
		if(head.next == null) {
			return null;
		}*/
		Node fastPointer = head;
		Node slowPointer = head;
		Node prev = null;
		while(fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			prev = slowPointer;
			slowPointer = slowPointer.next;
		}
		prev.next = slowPointer.next;
	}
	//print the list
	public void printList() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+ ",");
			curr = curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		DeleteMiddleNode list = new DeleteMiddleNode();
		list.push(12);
		list.push(23);
		list.push(72);
		list.push(82);
		list.push(89);
		list.printList();
		list.deleteNode();
		System.out.println("After deleting middle node");
		list.printList();
	}
}
