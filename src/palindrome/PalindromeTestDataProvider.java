package palindrome;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class PalindromeTestDataProvider {

	@DataProvider(name = "test true for arguments")
	public Object [][] provideArgumentsToTestTrue(){
	return new Object[][] {{"mom"}};
	}

	@DataProvider(name = "test false for arguments")
	public Object [][] provideArgumentsToTestFalse(){
	return new Object[][] {{"dude"},{"dad mom"},{"    "}};
	}
	
	@DataProvider(name = "test exceptions")
	public Object [][] provideArgumentsToThrowException(){
	return new Object[][] {{""},{122}};
	}
		
	
	@Test(dataProvider = "test false for arguments")
	public void testFalse(Object phrase){		
		assertFalse(Palindrome.isPalindrome(phrase));
	}
	
	@Test(dataProvider = "test true for arguments")
	public void testTrue(Object phrase){		
		assertTrue(Palindrome.isPalindrome(phrase));
	}
	
	@Test(dataProvider = "test exceptions", expectedExceptions = IllegalArgumentException.class)	
	public void testExceptions(Object phrase){		
			Palindrome.isPalindrome(phrase);

	}
}
