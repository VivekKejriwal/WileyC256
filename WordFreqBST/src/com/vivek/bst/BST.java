package com.vivek.bst;

public class BST<T extends Comparable<T>> {

	class Node{
		T key;
		Node left,right;
		int freq = 0;
		public Node(T key) {
			super();
			this.key = key;
			this.freq=1;
		}
		
	}
	
	Node root;
	
	public void insert(T key) {
		root=insertRec(root, key);
	}

	private Node insertRec(Node root, T key) {
		// if the tree is empty
		if (root == null) {
			root = new Node(key);
			return root;
		}
		int val = key.compareTo(root.key);
		if (val < 0)
			root.left = insertRec(root.left, key);
		else if (val > 0)
			root.right = insertRec(root.right, key);
		else
			root.freq += 1;
		return root;
	}
	
	
	public void inorderTraversal() {
		inorderRec(root);
	}
	
	//Left,root,right
	private void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key+" having Frequency : "+root.freq);
			inorderRec(root.right);
		}
	}
	
//	public int highest() {
//		Node curr =root;
//		while(curr.right!=null)
//			curr = curr.right;
//		return curr.key;
//	}
//	public int highest(Node root) {
//		Node curr =root;
//		while(curr.right!=null)
//			curr = curr.right;
//		return curr.key;
//	}
//	public int lowest() {
//		Node curr =root;
//		while(curr.left!=null)
//			curr = curr.left;
//		return curr.key;
//	}
//	public int lowest(Node root) {
//		Node curr =root;
//		while(curr.left!=null)
//			curr = curr.left;
//		return curr.key;
//	}
//	public void delete(int key) {
//		root = deleteRec(root,key);
//	}
//	private Node deleteRec(Node root,int key) {
//		if(root == null)
//			return root;
//		if(root.key == key)
//		{
//			if(root.left!=null && root.right != null) {
//				int val = lowest(root.right);
//				root.right = deleteRec(root.right,val);
//				root.key = val;
//				return root;
//			}
//			if(root.right!=null)
//				return root.right;
//			if(root.left != null)
//				return root.left;
//			return null;
//		}
//		
//		if(root.key<key) {
//			root.right = deleteRec(root.right, key);
//		}
//		if(root.key>key)
//			root.left = deleteRec(root.left, key);
//		return root;
//	}
//	private int countLeaf(Node root) {
//		if(root == null)
//			return 0;
//		if(root.left == null && root.right == null)
//			return 1;
//		
//		return countLeaf(root.left)+countLeaf(root.right);
//	}
//	public int countLeaf() {
//		return countLeaf(root);
//	}
//	private int countNonLeaf(Node root) {
//		if(root == null)
//			return 0;
//		if(root.left == null && root.right == null)
//			return 0;
//		
//		return 1+countNonLeaf(root.left)+countNonLeaf(root.right);
//	}
//	public int countNonLeaf() {
//		return countNonLeaf(root);
//	}
//	public int height() {
//		return height(root);
//	}
//	private int height(Node root) {
//		if(root == null)
//			return 0;
//		return 1+Math.max(height(root.left),height(root.right));
//	}
	
}

