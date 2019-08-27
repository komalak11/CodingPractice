package CTCI;

import java.util.Stack;

public class StackMin {
	Stack<Integer> s;
	Integer minElement;
	StackMin(){
		s = new Stack<Integer>();
	}
	void getMin() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Minimum Element is"+minElement);
		}
	}
	void peek() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Integer t = s.peek();
		System.out.println("Top element is");
		if(t<minElement) {
			System.out.println(minElement);
		}
		else {
			System.out.println(t);
		}
	}
	void pop() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Top element must be removed");
		Integer t = s.pop();
		if(t<minElement) {
			System.out.println(minElement);
			minElement = 2*minElement - t;
		}
		else {
			System.out.println(t);
		}
	}
	void push(Integer x) {
		if(s.isEmpty()) {
			minElement = x;
			s.push(x);
			System.out.println("Number Inserted" + x);
		}
		if(x<minElement) {
			s.push(2*x-minElement);
			minElement = x;
		}
		else {
			s.push(x);
			System.out.println("Number Inserted" + x);
		}
	}
	public static void main(String[] args) {
		StackMin minimum = new StackMin();
		minimum.push(6);
		minimum.push(8);
		minimum.push(8);
		minimum.push(1);
		minimum.getMin();
		minimum.pop();
		minimum.getMin();
		minimum.push(0);
		minimum.getMin();
		minimum.peek();
	}
}
