package practice;

import java.util.*;

public class DoublyLinkedList {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
		}
	}
	
	public void pushNode(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		newNode.prev = null;
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	public void insertAfterNode(Node prevNode,int newData) {
		if(prevNode == null) {
			System.out.println("The previous node cannot be zero");
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next != null) {
			newNode.prev.next = newNode;
		}
		
	}
	
	//appends to the end
	public void append(int newData) {
		Node newNode = new Node(newData);
		Node last = head;
		newNode.next = null;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		//else traverse till the last node
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.next = last;
	}
	
	public void printList(Node node) {
		Node last = null;
		System.out.println("Forward traversal");
		while(node != null) {
			System.out.println(node.data+" ");
			last = node;
			node = node.next;
		}
		System.out.println("Reverse traversal");
		while(last != null) {
			System.out.println(last.data+" ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize an empty list
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.pushNode(7);
		doublyLinkedList.pushNode(7);
		doublyLinkedList.insertAfterNode(doublyLinkedList.head.next, 17);
		doublyLinkedList.append(6);
		System.out.println("The list is");
		doublyLinkedList.printList(doublyLinkedList.head);

	}

}
