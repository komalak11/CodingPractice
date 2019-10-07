package practice;

import java.util.*;

public class ToplogicalSortingAlternate {
	private int V;
	private LinkedList<Integer> adj[]; //adjacency list
	ToplogicalSortingAlternate(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;++i) {
			adj[i] = new LinkedList();
		}
	}
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	//recursive function for topological sort
	void topologicalSortUtil(int v,boolean visited[],Stack stack) {
		visited[v] = true;
		Integer i;
		Iterator<Integer> iterator = adj[v].iterator();
		while(iterator.hasNext()) {
			i = iterator.next();
			if(!visited[i]) {
				topologicalSortUtil(i,visited,stack);
			}
		}
		stack.push(new Integer(v));
	}
	void topologicalSort() {
		Stack stack = new Stack();
		boolean visited[] = new boolean[V];
		for(int i=0;i<V;i++) {
			visited[i] = false;
		}
		for(int i=0;i<V;i++) {
			if(visited[i] == false) {
				topologicalSortUtil(i,visited,stack);
			}
		}
		while(stack.empty()==false) {
			System.out.print(stack.pop()+" ");
		}
	}
	public static void main(String[] args) {
		ToplogicalSortingAlternate sort = new ToplogicalSortingAlternate(6);
		sort.addEdge(5, 2); 
        sort.addEdge(5, 0); 
        sort.addEdge(4, 0); 
        sort.addEdge(4, 1); 
        sort.addEdge(2, 3); 
        sort.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        sort.topologicalSort(); 
	}
}
