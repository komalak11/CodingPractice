package practice;

import java.util.*;

public class QueueMethods_deQueue {
	
	static class Queue{
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		Stack<Integer> s2 = new Stack<Integer>();
		
	}
	
	//to push an item into stack 1
	
	static void push(Stack<Integer> top_ref,int new_data) {
		
		top_ref.push(new_data);
	}
	
	//function to pop an item from the stack
	
	static Integer pop(Stack<Integer> top_ref) {
		
		if(top_ref.isEmpty()) {
			
			System.out.println("Stack underflow");
			
			System.exit(0);
		}
		
		return top_ref.pop();
	}
	
	static void enQueue(Queue q,int x) {
		
		push(q.s1,x);
		
	}
	
	static int deQueue(Queue q) {
		
		int x;
		
		//if both stacks are empty then error
		
		if(q.s1.isEmpty() && q.s2.isEmpty()) {
			
			System.out.println("Stacks are empty");
			
			System.exit(0);
		}
		
		//move elements from stack 1 to stack 2 if stack 2 is empty
		
		if(q.s2.isEmpty()) {
			
			while(!q.s1.isEmpty()) {
				
				x=pop(q.s1);
				
				push(q.s2,x);
			}
		}
		
		x = pop(q.s2);
		
		return x;
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.s1 = new Stack<>();
		q.s2 = new Stack<>();
		
		enQueue(q,1234234);
		enQueue(q,645645);
		
		System.out.println(deQueue(q));
	}
	
}

