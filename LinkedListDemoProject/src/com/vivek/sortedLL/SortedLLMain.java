package com.vivek.sortedLL;

import java.util.Scanner;


public class SortedLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		SortedLL<Integer> linkedList = new SortedLL<>();
		while (true) {
			int ch;
			System.out.println("press 0 for exit and 1 for Insert and 2 for delete: ");
			ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("Enter element");
				linkedList.insertElement(scanner.nextInt());
			} else if (ch == 2) {
				System.out.println("Delete element");
				linkedList.deleteElement(scanner.nextInt());
			} else {
				break;
			}
		}

		linkedList.displayList();
	}

}
