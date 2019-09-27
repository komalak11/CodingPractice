package CTCI;

import CTCI.Node;

class Height{
	int height = 0;
}

public class CheckBalanced {
	static Node root;
	boolean isBalanced(Node root, Height height) {
		if(root == null) {
			height.height = 0;
			return true;
		}
		Height leftHeight = new Height();
		Height rightHeight = new Height();
		boolean left = isBalanced(root.left,leftHeight);
		boolean right = isBalanced(root.right,rightHeight);
		int lh = leftHeight.height;
		int rh = rightHeight.height;
		height.height = (lh>rh?lh:rh)+1;
		if(lh-rh>=2 || rh-lh>=2) {
			return false;
		}
		else {
			return (left&right);
		}
	}
	public static void main(String[] args) {
		Height height = new Height();
		CheckBalanced isTreeBalanced = new CheckBalanced();
		if(isTreeBalanced.isBalanced(root, height)) System.out.println("True");
		else System.out.println("False");
		isTreeBalanced.root = new Node(8);
		isTreeBalanced.root.left = new Node(89);
		isTreeBalanced.root.left.right = new Node(89);
		isTreeBalanced.root.left.left = new Node(89);
		isTreeBalanced.root.right = new Node(89);
	}
}
