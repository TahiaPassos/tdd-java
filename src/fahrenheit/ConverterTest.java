package fahrenheit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ConverterTest {
	
	@Test
	@DisplayName("Canary Test")
	public void testOne(){

		assertTrue(true);

	}

	@Test
	@DisplayName("Return 0 for 32")
	public void testThirtyTwo(){		
	
		double fahrenheit = 32.0;
		double expected = 0.0;
		
		Double actual = 0.0;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Return 10 for 50")
	public void testFifty(){

	}
	
	@Test
	@DisplayName("Return 100 for 212")
	public void testTwoHundred(){

	}
	
	@Test
	@DisplayName("Return -40 for -40")
	public void testNegative(){

	}

	@Test
	@DisplayName("Return -273.15 for -459.67")
	public void testFourHundred(){
		
	}
	

}
