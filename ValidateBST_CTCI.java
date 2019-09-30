package CTCI;

import CTCI.Node;

public class ValidateBST {
	Node root;
	Node previous;
	boolean isBST() {
		previous = null;
		return isBST(root);
	}
	boolean isBST(Node node) {
		//traverse the tree inorder method
		if(node != null) {
			if(!isBST(node.left)) {
				return false;
			}
			if(previous !=null && node.data<=previous.data) {
				return false;
			}
			previous = node;
			return (isBST(node.right));
		}
		return true;
	}
public static void main(String[] args) {
	ValidateBST tree = new ValidateBST();
	tree.root = new Node(4);
	tree.root.left = new Node(2);
	tree.root.right = new Node(5);
	if(tree.isBST()) {
		System.out.println("is BST");
	}
	else {
		System.out.println("is not BST");
	}
}
}
