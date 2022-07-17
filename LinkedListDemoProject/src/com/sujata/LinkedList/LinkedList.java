package com.sujata.LinkedList;

public class LinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node head;
	
	/*
	 * Newly created Node can be the first Node : when we don't have list
	 *  Newly created Node can be the last Node : when we have list
	 */
	public void insertElement(int data) {
		Node newNode=new Node(data);
		
		//if list is blank
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
	}
	
	public void displayList() {
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	public Node reverse(Node head) {
		Node curr = head,prev = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public void reverseDisplayList() {
		head = reverse(head);
		displayList();
		head = reverse(head);
	}
	public void deleteElement(int data) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			if(curr.data == data) {
				if(prev == null)
					head = head.next;
				else
					prev.next = curr.next;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}
