
public class LList {
	
	Node head; //head of the list
	
	class Node{
		
		int data;
		Node next;
		Node (int d){ //constructor
			
			data =d;
			next=null;
			
		}
	}
	
	public void display(){
		
		Node n = head;
		
		while(n!=null) {
			
			System.out.println(n.data);
			
			n = n.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		LList n_list = new LList();
		
		n_list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		n_list.head.next = second;
		second.next = third;
		
		n_list.display();
	}

}
