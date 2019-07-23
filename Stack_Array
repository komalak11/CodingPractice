//using arrays
import java.util.*;

public class StackImplementation {
	
	static final int max = 1000;
	
	int top;
	
	int a[] = new int[max]; //maximum size of stack
	
	boolean isEmpty(){
		
		return(top<0);
		
	}
	
	StackImplementation(){
		
		top = -1;
	}
	
	boolean push(int x) {
		
		if(top>=(max-1)){
			
			System.out.println("Stack Overflow");
			
			return false;
		}
		
		else {
			
			a[++top] = x;
			
			System.out.println(x+" Pushed into stack");
			
			return true;
		}
	}
	
	int pop() {
		
		if(top<0) {
			
			System.out.println("Stack Underflow");
			
			return 0;
					
		}
		
		else {
			
			int x = a[top];
			
			return x;
		}
	}
}

class Main{
	
	public static void main(String[] args) {
		
		StackImplementation s = new StackImplementation();
		
		s.push(199);
		s.push(34);
		System.out.println(s.pop());
	}
}
