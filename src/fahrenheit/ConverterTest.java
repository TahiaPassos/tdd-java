package fahrenheit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ConverterTest {
	
	double expected;
	double celsius;
	double fahrenheit;
	
//	@BeforeEach
//	public void getCelsius() {
//		celsius = FahrenheitConverter.fahrenheitToCelsius(fahrenheit);
//	}
	
	@Test
	@DisplayName("Canary Test")
	public void testOne(){

		assertTrue(true);

	}

	@Test
	@DisplayName("Return 0 for 32")
	public void testThirtyTwo(){		
		
		expected = 0.0;
		fahrenheit = 32.0;
		celsius = FahrenheitConverter.fahrenheitToCelsius(fahrenheit);
		assertEquals(expected, celsius);
	}
	
	@Test
	@DisplayName("Return 10 for 50")
	public void testFifty(){
		
		expected = 10.0;
		fahrenheit = 50.0;
		celsius = FahrenheitConverter.fahrenheitToCelsius(fahrenheit);
		assertEquals(expected, celsius);
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
