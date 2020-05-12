package app;

import app.stack.MyStack;

public class ReverseString {
	private static void stackOfIStrings() {
		MyStack<String> stack = new MyStack();
		stack.push("Five");
		stack.push("Four");
		stack.push("Three");
		stack.push("Two");
		stack.push("One");

		MyStack<String> reverseStack = new MyStack();
		System.out.println("Size of the stack: " + stack.size());
		System.out.printf("Elements of the stack: ");
		while (!stack.isEmpty()) {
			String temp = stack.pop();
			reverseStack.push(temp);
			System.out.printf(" %s", temp);
		}
		System.out.print("\nAfter reversing: ");
		reverseStack.paint();
	}
	public static void main(String[] args) {
		System.out.println("Stack of Strings");
		stackOfIStrings();
	}
}
