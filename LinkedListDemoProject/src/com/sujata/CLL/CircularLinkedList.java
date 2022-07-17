package com.sujata.CLL;

public class CircularLinkedList {

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
			head.next = head;
		}
		else {
			Node last=head;
			while(last.next!=head) {
				last=last.next;
			}
			last.next=newNode;
			newNode.next = head;
		}
	}
	
	public void displayList() {
		if(head == null)
			return;
		Node currentNode=head;
		while(currentNode.next!=head) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		System.out.println(currentNode.data);
	}
	
	public void deleteElement(int data) {
		if(head.data == data) {
			if(head.next == head) {
				head = null;
				return;
			}
			Node tail = head;
			while(tail.next!=head)
				tail = tail.next;
			tail.next = head.next;
			head = tail.next;
			return;
		}
		Node curr = head.next;
		Node prev = head;
		while(curr!=head) {
			if(curr.data == data) {
				prev.next = curr.next;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}