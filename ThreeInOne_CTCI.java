package CTCI;

public class ThreeInOne {
	int arr[];
	int top[];
	int next[];
	
	int n,k;
	int free;
	//constructor to create k stacks in an array of size n
	ThreeInOne(int k1,int n1){
		k = k1;
		n = n1;
		arr = new int[n];
		top = new int[k];
		next = new int[n];
		//Intilize all stacks as empty
		for(int i=0;i<k;i++) {
			top[i] = -1;
		}
		//Initize all spaces as free
		free = 0;
		for(int i=0;i<n;i++) {
			next[i] = i+1;
			next[n-1] = -1; //-1 is used to indicate end of free list
		}
	}
	//utility function to check if space is available
	boolean isFull() {
		return (free==-1);
	}
	void push(int item,int sn) {
		if(isFull()) {
			System.out.println("Stack overflow");
			return;
		}
		int i = free; // store index of the first free slot
		free = next[i];
		next[i] = top[sn];
		top[sn] = i;
		//put the item in array
		arr[i] = item;
	}
	
	boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}
	
	int pop(int sn) {
		if(isEmpty(sn)) {
			System.out.println("Stack underflow");
			return Integer.MAX_VALUE;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = free;
		free = i;
		return arr[i];
	}
	public static void main(String[] args) {
		int k =3; int n=10;
		ThreeInOne newStacks = new ThreeInOne(k,n);
		newStacks.push(15,2);
		newStacks.push(45,2);
		newStacks.push(1, 1);
		newStacks.push(9,0);
		System.out.println(newStacks.pop(2));
	}
}
