package practice;

public class nthElementLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next = null;
		}
	}
	
	Node head;
	public int getnthInt(int index) {
		Node current = head;
		int count = 0;
		while(current != null) {
			if(count == index) {
				count++;
				return current.data;
			}
		}
		assert(false);
		return 0;
	}
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		nthElementLinkedList nthElement = new nthElementLinkedList();
		nthElement.push(76);
		nthElement.push(999);
		nthElement.push(8);
		System.out.println("nth element is" + nthElement.getnthInt(3));

	}

}
