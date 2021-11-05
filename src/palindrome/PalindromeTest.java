package palindrome;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class PalindromeTest {
	
	@Test
	@DisplayName("True for mom")
	void testMom(){
		assertTrue(Palindrome.isPalindrome("mom"));
	}
	
	@Test
	@DisplayName("False for dude")
	void testDude(){

	}
	
	@Test
	@DisplayName("True for mom mom")
	void testMomMom(){

	}
	
	@Test
	@DisplayName("False for dad mom")
	void testDadMom(){

	}
	
	@Test
	@DisplayName("True for whitespace")
	void testWhitespace(){

	}
	
	@Test
	@DisplayName("Error for empty String")
	void testEmptyString(){

	}
	
	@Test
	@DisplayName("Error for not a String")
	void testNotAString(){

	}
}
