package com.vivek.sortedLL;

public class SortedLL<T extends Comparable<T>> {
	class Node {
		T data;
		Node next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	Node head;

	public void insertElement(T data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node curr = head, prev = null;
		while (curr != null) {
			if (prev == null) {
				if (head.data.compareTo(data) >= 0) {
					newNode.next = head;
					head = newNode;
					return;
				}
			} else if (data.compareTo(prev.data) >= 0 && curr.data.compareTo(data) >= 0) {
				prev.next = new Node(data);
				prev.next.next = curr;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(data);
	}

	public void displayList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void deleteElement(T data) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			if (curr.data.compareTo(data) == 0) {
				if (prev == null)
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
