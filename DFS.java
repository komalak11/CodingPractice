package practice;

import java.util.ArrayList;
import java.util.List;

//This program is Depth First Search of a graph using adjacency list representation. This is done recursively
class DFS{
	static class Node{
		int data;
		boolean visited;
		List<Node> neighbours;
		Node(int data){
			this.data = data;
			this.neighbours = new ArrayList<>();
		}
		public void addNeighbours(Node neighbourNode) {
			this.neighbours.add(neighbourNode);
		}
		public List<Node> getNeighbours(){
			return neighbours;
		}
		public void setNeighbours(List<Node> neighbours) {
			this.neighbours = neighbours;
		}
	}
	//Recursive function
	public void dfs(Node node) {
		System.out.print(node.data+" ");
		List<Node> neighbours = node.getNeighbours();
		node.visited = true;
		for(int i =0;i<neighbours.size();i++) {
			Node n = neighbours.get(i);
			if(n!=null&&!n.visited) {
				dfs(n);
			}
		}
	}
	public static void main(String[] args) {
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		
		node40.addNeighbours(node10);
		node10.addNeighbours(node50);
		node40.addNeighbours(node10);
		node50.addNeighbours(node20);
		
		DFS recursiveDFS = new DFS();
		recursiveDFS.dfs(node10);
	}
}
