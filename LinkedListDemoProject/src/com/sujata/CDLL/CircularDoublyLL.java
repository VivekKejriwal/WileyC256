package com.sujata.CDLL;

public class CircularDoublyLL {
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	Node head;
	
	public void insertElement(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			head.next = head;
			head.prev = head;
		}
		else {
			Node last=head.prev;
			last.next = newNode;
			newNode.prev = last;
			newNode.next = head;
			head.prev = newNode;
			return;
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
			Node tail = head.prev;
			tail.next = head.next;
			tail.next.prev = tail;
			head = tail.next;
			return;
		}
		Node curr = head.next;
		Node prev = head;
		while(curr!=head) {
			if(curr.data == data) {
				prev.next = curr.next;
				prev.next.prev = prev;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}