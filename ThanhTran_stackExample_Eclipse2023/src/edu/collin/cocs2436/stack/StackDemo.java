package edu.collin.cocs2436.stack;


/**
 * This is a demo program to test the stack implementation
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		IStack<String> stack = new Stack<>(1, 1);
		System.out.println("Is list empty: ");
		System.out.println(stack.isEmpty());
		
		stack.push(new String("1"));
		stack.push(new String("2"));
		stack.push(new String("3"));
		System.out.println("list: ");
		System.out.println(stack);
		System.out.println("Is list empty: ");
		System.out.println(stack.isEmpty());
		System.out.println("Get me the top of the stack value: ");
		System.out.println(stack.peek());
		System.out.println("Pop implimentation");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		
	}
}
