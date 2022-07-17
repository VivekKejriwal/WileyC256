package com.sujata.deque;

public class Deque<T> {

	class Node {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}
	}

	Node head, tail;
	int size;

	public void addFirst(T data) {
		if (head == null) {
			head = tail = new Node(data);
			size++;
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(T data) {
		if (tail == null) {
			head = tail = new Node(data);
			size++;
			return;
		}
		Node newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public T removeFirst() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return null;
		}
		if (size == 1) {
			T data = head.data;
			head = tail = null;
			size--;
			return data;
		}
		T data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public T removeLast() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return null;
		}
		if (size == 1) {
			T data = tail.data;
			head = tail = null;
			size--;
			return data;
		}
		Node curr = head;
		while (curr.next != tail)
			curr = curr.next;
		T data = tail.data;
		curr.next = null;
		tail = curr;
		size--;
		return data;
	}

	public void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;

		}
		System.out.println();
	}

}
