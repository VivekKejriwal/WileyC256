package com.sujata.stack;


public class Stack<T> {
	Node head;
	int size;
	class Node{
		T data;
		Node next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	
	
	public void push(T data) {
		if(head == null)
		{
			head = new Node(data);
			size++;
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	public T pop() {
		if(head == null) {
			System.out.println("Stack Underflow");
			return null;
		}
		T data = head.data;
		head = head.next;
		size--;
		return data;
	}
	public void display() {
		Node curr= head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
			
		}
		System.out.println();
	}
}
