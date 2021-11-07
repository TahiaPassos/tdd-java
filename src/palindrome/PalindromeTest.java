package palindrome;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PalindromeTest {
	
	@Test
	@DisplayName("True for mom")
	public void testMom(){
		assertTrue(Palindrome.isPalindrome("mom"));
	}
	
	@Test
	@DisplayName("False for dude")
	public void testDude(){
		assertFalse(Palindrome.isPalindrome("dude"));
	}
	
	@Test
	@DisplayName("False for dad mom")
	public void testDadMom(){
		assertFalse(Palindrome.isPalindrome("dad mom"));
	}
	
	@Test
	@DisplayName("False for whitespace")
	public void testWhitespace(){
		assertFalse(Palindrome.isPalindrome("   "));
	}
	
	@Test
	@DisplayName("Error for empty String")
	public void testEmptyString(){
		IllegalArgumentException emptyStringException = assertThrows(IllegalArgumentException.class, () -> {
			Palindrome.isPalindrome("");
		});
		
		assertEquals("empty strings are not palindromes", emptyStringException.getMessage());
	}
	
	@Test
	@DisplayName("Error for not a String")
	public void testNotAString(){
		RuntimeException notAStringException = assertThrows(RuntimeException.class, () -> {
			Palindrome.isPalindrome(121);
		});
		
		assertEquals("input must be a string", notAStringException.getMessage());
	}
}
