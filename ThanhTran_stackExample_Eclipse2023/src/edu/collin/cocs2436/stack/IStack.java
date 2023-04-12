package edu.collin.cocs2436.stack;

/**
 * An interface providing access to the stack functionality
 *
 * @author (put your name here, and your class number/section/semester)
 * 
 * @param <T> The type of elements on this stack
 */
public interface IStack<T> {

	/**
	 * Tests if the stack is empty
	 * 
	 * @return true if the stack is empty and false otherwise
	 */
	boolean isEmpty();

	/**
	 * Pushes an element onto the top of the stack
	 * 
	 * @param element The element being pushed
	 * @return The element argument
	 */
	T push(T element);

	/**
	 * Returns the element at the top of the stack without removing it
	 * 
	 * @return The element at the top of the stack
	 * @throws: EmptyStackException - if this stack is empty.
	 */
	T peek();

	/**
	 * Removes the element at the top of this stack
	 * 
	 * @return The removed element
	 * @throws: EmptyStackException - if this stack is empty.
	 */
	T pop();
}
