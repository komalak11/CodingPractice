//TELL ME WHAT IS THE PROBLEM. I HAVE DECLARED EVERYTHING HAS INTEGER, BUT NODES ARE OF OBJECT TREENODE. UNABLE TO EXPLICITLTY CONVERT
package CTCI;

import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int d){
		this.data = d;
		this.left = this.right = null;
	}
}

public class BSTSequences {
	static TreeNode root;
	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode node){
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		if(node == null) {
			result.add(new LinkedList<Integer>());
			return result;
		}
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.data);
		//Recurse on the left and right subtrees
		ArrayList<LinkedList<Integer>> leftSeq = new ArrayList<LinkedList<Integer>>(node.left); //ERROR
		ArrayList<LinkedList<Integer>> rightSeq = new ArrayList<LinkedList<Integer>>(node.right); //ERROR
		//Weave together each list from the left and right sides
		for(LinkedList<Integer> left:leftSeq) {
			for(LinkedList<Integer> right:rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveLists(left,right,weaved,prefix);
				result.addAll(weaved);
			}
		}
		return result;
	}
	//Weave the list together in all possible ways
	//This algorithm works by removing head from one list,recursing,and then doing the same with the other list

	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
			ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		if(first.size() == 0 || second.size() == 0) {
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
		}
		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weaveLists(first,second,results,prefix);
		prefix.removeLast();
		first.addFirst(headFirst);
		
		int headSecond = second.removeFirst();
		prefix.addLast(headSecond);
		weaveLists(first,second,results,prefix);
		prefix.removeLast();
		second.addFirst(headSecond);
	}
	public static void main(String[] args) {
		BSTSequences sequences = new BSTSequences();
		sequences.root = new TreeNode(10);
		sequences.root.left = new TreeNode(20);
		sequences.root.right = new TreeNode(30);
		sequences.root.right.left = new TreeNode(40);
		ArrayList<LinkedList<Integer>> result = sequences.allSequences(root);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}
