package CTCI;

import CTCI.Node;

public class FirstCommonAncestor {
	Node root;
	static boolean v1 = false;
	static boolean v2 = false;
	Node findLCAUtil(Node node,int first,int second) {
		if(node == null) {
			return null;
		}
		Node temp = null;
		if(node.data == first) {
			v1 = true;
			temp = node;
		}
		if(node.data == second) {
			v2 = true;
			temp = node;
		}
		Node leftLCA = findLCAUtil(node.left,first,second);
		Node rightLCA = findLCAUtil(node.right,first,second);
		if(temp!=null) {
			return temp;
		}
		if(leftLCA!=null&&rightLCA!=null) {
			return node;
		}
		return leftLCA!=null?leftLCA:rightLCA;
	}
	Node findLCA(int first,int second) {
		v1 = false;
		v2 = false;
		Node LCA = findLCAUtil(root,first,second);
		if(v1&&v2) {
			return LCA;
		}
		return null;
	}
	public static void main(String[] args) {
		FirstCommonAncestor tree = new FirstCommonAncestor();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		Node lca = tree.findLCA(1, 7);
		System.out.println(lca.data);
	}
}
