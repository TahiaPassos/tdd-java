package stack;

public class Stack {
	
	boolean empty = true;
	int capacity = 2;
	int count = 0;
	Object []elements;
	
	public Stack() {
		 elements = new Object[capacity];
		}
	
	public Stack(int capacity) {
		if(capacity < 1) throw new RuntimeException("invalid capacity");
		this.capacity = capacity;
		elements = new Object[capacity];
		}

	public boolean isEmpty() {
		return count == 0;
	}

	public Object size() {
		return count;
	}

	public void push(Object element) {
		if(count == 2) throw new RuntimeException("capacitiy overflow error");
		count += 1;
		elements[count -1] = element;
	}

	public Object pop() {
		if(count == 0) throw new RuntimeException("capacitiy underflow error");
		count-= 1;
		return elements[count];
	}
}
