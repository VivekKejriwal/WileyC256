package com.sujata.deque;

import java.util.Scanner;

public class DequeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new Deque<>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"1. To add to Front\n2. To add to Rear\n3. To remove from front\n4. To remove from rear\n5. To display Queue \nAnything else to Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element");
				Integer ele = sc.nextInt();
				deque.addFirst(ele);
				System.out.println("Current Queue is of length " + deque.size);
				break;
			case 2:
				System.out.println("Enter the element");
				Integer ele1 = sc.nextInt();
				deque.addLast(ele1);
				System.out.println("Current Queue is of length " + deque.size);
				break;
			case 3:
				System.out.println("Removed element is " + deque.removeFirst());
				System.out.println("Current Queue is of length " + deque.size);
				break;
			case 4:
				System.out.println("Removed element is " + deque.removeLast());
				System.out.println("Current Queue is of length " + deque.size);
				break;
			case 5:
				deque.display();
				break;
			default:
				System.out.println("Thank you for using my Queue");
				System.exit(0);
			}
		}
	}

}
