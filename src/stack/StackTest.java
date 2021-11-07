package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class StackTest {
	Stack stack = new Stack();
	
	@Test
	@DisplayName("starts empty")
	public void testEmptyStack(){	
		assertTrue(stack.isEmpty());
	}
	
	@Test
	@DisplayName("starts with stack size of 0")
	public void testStackSize(){
		assertEquals(0, stack.size());
	}
	
	@Test
	@DisplayName("is not empty when pushed")
	public void testEmptyAfterPush(){
		stack.push(1);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	@DisplayName("stack size is 1 when pushed")
	public void testSizeAfterPush(){
		stack.push(2);
		assertEquals(1, stack.size());
	}
	
	@Test
	@DisplayName("stack is empty when pushed and popped")
	public void testEmptyAfterPushPop(){
		stack.push('t');
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	@DisplayName("stack size is 0 when pushed and popped")
	public void testSizeAfterPushPop(){
		stack.push('f');
		stack.pop();
		assertEquals(0, stack.size());
	}

	@Test
	@DisplayName("throws overflow error when pushing to a stack at full capacity")
	public void testStackOverflow(){
		RuntimeException overflowException = assertThrows(RuntimeException.class, () -> {
			stack.push(1);
			stack.push(2);
			stack.push(3);
		});
		
		assertEquals("capacitiy overflow error", overflowException.getMessage());
	}
	
	@Test
	@DisplayName("throw underflow error when popping an empty stack")
	public void testStackUnderflow(){
		RuntimeException underflowException = assertThrows(RuntimeException.class, () -> {
			stack.pop();
		});
		
		assertEquals("capacitiy underflow error", underflowException.getMessage());
	}
	
	@Test
	@DisplayName("pops the same one item when push")
	public void testPopReturn(){
		stack.push('a');
		assertEquals('a', stack.pop());
	}
	
	@Test
	@DisplayName("pops two items with the most recent first")
	public void testLastTwoReturns(){
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
	}
	
	@Test
	@DisplayName("accepts only a positive capacity")
	public void testPositiveIntegerCapacity(){
		
	}
}
