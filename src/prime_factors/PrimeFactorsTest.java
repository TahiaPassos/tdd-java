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
	return new Object[][] {
		{new ArrayList<Integer>(),1}, 
		{new ArrayList<Integer>(Arrays.asList(2)),2}, 
		{new ArrayList<Integer>(Arrays.asList(3)),3}, 
		{new ArrayList<Integer>(Arrays.asList(2,2)),4}, 
		{new ArrayList<Integer>(Arrays.asList(5)),5}, 
		{new ArrayList<Integer>(Arrays.asList(2,3)),6}, 
		{new ArrayList<Integer>(Arrays.asList(7)),7}, 
		{new ArrayList<Integer>(Arrays.asList(2,2,2)),8}, 
		{new ArrayList<Integer>(Arrays.asList(3,3)),9}};
	}
			
	@Test(dataProvider = "test prime factors")
	public void testPrimeFactors(List<Integer> expectedList, int primeNumbers){		
		
		PrimeFactors primeFactors = new PrimeFactors();
		List<Integer> actualArray = primeFactors.findPrimeFactors(primeNumbers);
			
		assertEquals(expectedList, actualArray);
	}

}
