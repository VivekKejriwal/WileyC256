package com.sujata.stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to push and 2 to Pop and 3 to display and anything else to Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element");
				Integer ele = sc.nextInt();
				stack.push(ele);
				System.out.println("Current stack is of length " + stack.size);
				break;
			case 2:
				System.out.println("Popped element is "+stack.pop());
				System.out.println("Current stack is of length " + stack.size);
				break;
			case 3:
				stack.display();
				break;
			default:
				System.out.println("Thank you for using my stack");
				System.exit(0);
			}
		}

	}

}
