package CTCI;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ListOfDepths {
	ArrayList<ListNode> alist = new ArrayList<>();
	public void levelOrder(Node root) {
		int height = height(root);
		for(int i=1;i<=height;i++) {
			printLevels(root,i);
			System.out.println("");
		}
	}
	public void printLevels(Node root,int i) {
		int height = height(root);
		if(root == null) return;
		if(height == 1) {
			System.out.println(" "+ root.data);
		}
	}
	public int height(Node root) {
		if(root == null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public void levelOrderQueue(Node root) {
		Queue q = new LinkedList<>();
		int levelNodes = 0;
		if(root == null) return;
		q.add(root);
		while(!q.isEmpty()) {
			levelNodes = q.size();
			ListNode current = null;
			ListNode head = null;
			while(levelNodes>0) {
			Node n = (Node)q.remove(); //Dequeuing
			ListNode ln = new ListNode(n.data);
			if(head==null) {
				head = ln;
				current = ln;
			}
			else {
				current.next = ln;
				current = current.next;
			}
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
			levelNodes--;
			}
			alist.add(head);
		}
		display(alist);
	}
	public void display(ArrayList<ListNode> alist) {
		Iterator iterator = alist.iterator();
		while(iterator.hasNext()) {
			ListNode head = (ListNode)iterator.next();
			while(head!=null) {
				System.out.print("-->"+head.data);
				head = head.next;
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(10);
		root.left.left = new Node(18);
		root.right = new Node(18);
		root.right.right = new Node(12);
		root.left.right = new Node(173);
		root.right.left = new Node(28);
		root.right.right.right = new Node(8);
		ListOfDepths linkedLists = new ListOfDepths();
		linkedLists.levelOrderQueue(root);
	}
}
