package stack;

public class Stack {
	
	boolean empty = true;
	int count = 0;

	public boolean isEmpty() {
		return count == 0;
	}

	public Object size() {
		return count;
	}

	public void push() {
		if(count == 2) throw new RuntimeException("capacitiy overflow error");
		count += 1;
	}

	public void pop() {
		if(count == 0) throw new RuntimeException("capacitiy underflow error");
		count-= 1;
	}
}

