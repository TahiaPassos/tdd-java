package prime_factors;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PrimeFactorsTest {
	
	@DataProvider(name = "test prime factors")
	public Object [][] provideNumbers(){
//	return new Object[][] {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}};
	return new Object[][] {{3}};
	}
		
	
	@Test(dataProvider = "test prime factors")
	public void testPrimeFa(int primeNumbers){		
		PrimeFactors primeFactors = new PrimeFactors();
		
//		assertEquals(new int[0], primeFactors.findPrimeFactors(primeNumbers));
//		assertEquals(2, primeFactors.findPrimeFactors(primeNumbers));
		
		List<Integer> expectedArray = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> actualArray = primeFactors.findPrimeFactors(primeNumbers);
			
			assertEquals(expectedArray, actualArray);


	}

}
