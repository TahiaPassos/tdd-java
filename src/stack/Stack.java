package stack;

public class Stack {
	
	boolean empty = true;
	int count = 0;
	Object element;

	public boolean isEmpty() {
		return count == 0;
	}

	public Object size() {
		return count;
	}

	public void push(Object ele) {
		if(count == 2) throw new RuntimeException("capacitiy overflow error");
		count += 1;
		element = ele;
	}

	public Object pop() {
		if(count == 0) throw new RuntimeException("capacitiy underflow error");
		count-= 1;
		return element;
	}
}

