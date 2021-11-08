package prime_factors;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PrimeFactorsTest {
	
	@DataProvider(name = "test exceptions")
	public Object [][] provideArgumentsToThrowException(){
	return new Object[][] {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}};
	}
		
	
	@Test(dataProvider = "test prime factors")
	public void testFalse(Object primeNumbers){		
		
	}

}
