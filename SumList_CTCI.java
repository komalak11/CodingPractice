package CTCI;


public class SumLists {
	static Node head1,head2;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

Node addTwoLists(Node first,Node second) {
	Node res = null; //resultant head node of the resultant list
	Node prev = null;
	Node temp = null;
	int carry = 0;
	int sum;
	while(first!=null || second != null) {
		sum = carry+(first != null?first.data:0)+(second != null?second.data:0);
		carry = (sum>10)?1:0;
		sum = sum%10;
		//create a new node with sum as data
		temp = new Node(sum);
		if(res == null) {
			res = temp;
		}
		else {
			prev.next = temp;
		}
		prev = temp;
		//move the pointers to the next nodes
		if(first != null) {
			first = first.next;
		}
		else {
			second = second.next;
		}
	}
	if(carry>0) {
		temp.next = new Node(carry);
	}
	return res;
}
public void printListNode(Node head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head = head.next;
	}
	System.out.println();
}
public static void main(String[] args) {
	SumLists list = new SumLists();
	list.head1 = new Node(8);
	list.head1.next = new Node(9);
	System.out.println("First list is");
	list.printListNode(head1);
	list.head2 = new Node(9);
	list.head2.next = new Node(8);
	System.out.println("Second list is");
	list.printListNode(head2);
	System.out.println("Sum of linked list is");
	Node result = list.addTwoLists(head1, head2);
	System.out.println(result);
}
}
