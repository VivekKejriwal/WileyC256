package com.sujata.CDLL;

import java.util.Scanner;

import com.sujata.CLL.CircularLinkedList;

public class CDLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		CircularDoublyLL linkedList = new CircularDoublyLL();
		while (true) {
			int ch;
			System.out.println("press 0 for Display and 1 for Insert and 2 for delete and else to Exit");
			ch = scanner.nextInt();
			if(ch == 0)
				linkedList.displayList();
			else if (ch == 1) {
				System.out.println("Enter element");
				linkedList.insertElement(scanner.nextInt());
			} else if (ch == 2) {
				System.out.println("Delete element");
				linkedList.deleteElement(scanner.nextInt());
			} else {
				System.out.println("Hogya bhai Testing");
				break;
			}
		}


	}

}
