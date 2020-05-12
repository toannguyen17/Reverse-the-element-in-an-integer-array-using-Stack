package app;

import app.stack.MyStack;

import java.util.Arrays;

public class ReverseInteger {

	private static void stackOfIntegers() {
		//
		MyStack<Integer> stack = new MyStack();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		MyStack<Integer> reverseStack = new MyStack();

		System.out.println("Size of the stack: " + stack.size());
		System.out.printf("Elements of the stack: ");
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			reverseStack.push(temp);
			System.out.printf(" %d", temp);
		}
		System.out.print("\nAfter reversing: ");
		reverseStack.paint();
	}

	public static void main(String[] args) {
		System.out.println("Stack of integers");
		stackOfIntegers();
	}
}
