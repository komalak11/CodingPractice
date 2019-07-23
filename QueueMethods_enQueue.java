package practice;

import java.util.*;
import java.io.*;

public class QueueMethods_enQueue {
	
	static class queue{
		
		static Stack<Integer> s1 = new Stack<Integer>();
		
		static Stack<Integer> s2 = new Stack<Integer>();
		
		static void enQueue(int x) {
			
			//move all elements from s1 to s2
			
			while(!s1.isEmpty()) {
				
				s2.push(s1.pop());
			}
			
			//pushing the item into s1
			
			s1.push(x);
			
			//pushing everything back to s1 from s2
			
			while(!s2.empty()) {
				
				s1.push(s2.pop());
			}
		}
		
		static int deQueue() {
			
			//if stack is empty
			
			if(s1.isEmpty()){
				
				System.out.println("Stack is empty");
				
				System.exit(0);
				
			}
			
			int x = s1.peek();
			
			s1.pop();
			
			return x;
		}
	}
	
	public static void main(String[] args) {
		
		queue q = new queue();
		
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(5);
		q.enQueue(313142);
		
		System.out.println(q.deQueue());
	}

}
