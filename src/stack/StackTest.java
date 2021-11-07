package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
		stack.push();
		assertFalse(stack.isEmpty());
	}
	
	@Test
	@DisplayName("stack size is 1 when pushed")
	public void testSizeAfterPush(){
	}
	
	@Test
	@DisplayName("stack is empty when pushed and popped")
	public void testEmptyAfterPushPop(){

	}
	
	@Test
	@DisplayName("stack size is 0 when pushed and popped")
	public void testSizeAfterPushPop(){

	}

	@Test
	@DisplayName("throws overflow error when pushing to a stack at full capacity")
	public void testStackOverflow(){
		
	}
	
	@Test
	@DisplayName("throw underflow error when popping an empty stack")
	public void testStackUnderflow(){
		
	}
	
	@Test
	@DisplayName("pops the same one item when push")
	public void testPopReturn(){
		
	}
	
	@Test
	@DisplayName("pops two items with the most recent first")
	public void testLastTwoReturns(){
		
	}
	
	@Test
	@DisplayName("accepts only a positive capacity")
	public void testPositiveIntegerCapacity(){
		
	}
}
