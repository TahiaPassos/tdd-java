package stack;

public class Stack {
	
	boolean empty = true;
	int count = 0;

	public boolean isEmpty() {
		return empty;
	}

	public Object size() {
		return count;
	}

	public void push() {
		empty = false;
		count += 1;
	}

	public void pop() {
		empty = true;
	}
}

