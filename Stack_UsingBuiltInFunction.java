import java.util.*;
import java.io.*;

public class StackUsingList {
	//pushing element into stack
	static void stack_push(Stack<Integer> stack) {
		
		for(int i=0; i<5;i++) {
			
			stack.push(i);
		}
	}
	//popping elements from stack
	
	static void stack_pop(Stack<Integer> stack) {
		
		System.out.println("Pop : ");
		
		for(int i=0;i<5;i++) {
			
			Integer y = (Integer) stack.pop();
			
			System.out.println(y);
		}
	}
	
	//displaying elements on top of the stack
	
	static void stack_peek(Stack<Integer> stack) {
		
		Integer element = (Integer) stack.peek();
		
		System.out.println(element);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_push(stack); 
		stack_peek(stack);
	}
}
