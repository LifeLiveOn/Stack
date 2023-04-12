package edu.collin.cocs2436.stack;
public class Stack<T> implements IStack<T> {
	private static final int DEFAULT_CAPACITY=10;
	private static final int INCREMENT_CAPACITY=10;
	@SuppressWarnings("unused")
	private final int increment;
	private Object[] arr;
	private int top;
	
	public Stack() {
		this(DEFAULT_CAPACITY,INCREMENT_CAPACITY);
	}

	
	public Stack(int capacity, int increment) {
		if(capacity > 0 && increment >0) {
			this.increment = increment;
			arr = new Object[capacity];
			top = 0;
		}
		else {
			throw new IllegalArgumentException("Capacity and increment must > 0 ");
		}
		
	}



	@Override
	public boolean isEmpty() {
		return top==0;
	}
	
	@Override
	public T push(T element) {
		growIfNeeded();
		arr[top++]=element;

		return element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return (T) arr[top-1];
		
	}

	@Override
	public T pop() {
		T ret = peek();
		arr[--top] = null;
		return ret;
	}
	
	private void growIfNeeded() {
		if(top==arr.length) {
			Object CopyArr[] = new Object[arr.length+INCREMENT_CAPACITY];
			for(int i =0;i<arr.length;++i) {
				CopyArr[i] = arr[i];
			}
			arr = CopyArr;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[ ");
		for (int i = 0; i < top; i++) {
			builder.append(arr[i]).append(" ");
		}
		builder.append("]");
		return builder.toString();
	}

}
