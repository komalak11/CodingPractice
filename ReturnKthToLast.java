package CTCI;

public class ReturnKthToLast {
	static Node head;
	public class Node{
		Node next;
		int data;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int newData) {
	Node newNode = new Node(newData);
	newNode.next = head; //make the next of the new node as head
	head = newNode; //make head as the new node
	}
//Iterate over the linked list
	public Node nthToLast(Node node,int n) {
	Node curr = node;
	Node follower = node;
	//Iterate curr node by n, if end of the list if reached then possibly it is shorter than n
	for(int i=0;i<n;i++) {
		if(curr == null) {
			return null;
		}
		curr = curr.next;
	}
	if(curr==null) {
		return null;
	}
	//Move both nodes in unison until curr node is at the end of the list
	while(curr.next!=null) {
		curr = curr.next;
		follower = follower.next;
	}
	return follower;
	}
	//To print the node
	public static void printNode(Node node) {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		ReturnKthToLast list = new ReturnKthToLast();
		list.push(89);
		list.push(78);
		list.push(90);
		printNode(head);
		Node output = list.nthToLast(head, 1);
		System.out.println(output.data);
	}
}
