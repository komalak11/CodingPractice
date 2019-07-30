package practice;

import practice.SumofEvenOddNodes.Node;

public class SumofEvenOddNodes {
	
	static class Node{
		int data;
		Node next;
	}
	static Node root;
	static void insert(int newData) {
		Node pointer = root;
		Node tempNode = new Node();
		tempNode.data = newData;
		tempNode.next = null;
		if(root == null) {
			root=tempNode;
		}
		else {
			while(pointer.next!=null) {
				pointer = pointer.next;
				pointer.next = tempNode;
			}
		}
	}
	static void evenOdd(Node root) {
		int even=0;
		int odd=0;
		Node pointer = root;
		while(pointer != null) {
			if(pointer.data%2 == 0) {
				even+=pointer.data;
			}
			else {
				odd+=pointer.data;
			}
			pointer = pointer.next;
		}
		System.out.println("Even sum "+even);
		System.out.println("Odd sum "+odd);
	}
	public static void main(String[] args) {
		insert(2);
		insert(3);
		insert(2);
		evenOdd(root);
	}
}
