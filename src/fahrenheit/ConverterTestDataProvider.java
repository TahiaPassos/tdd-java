package fahrenheit;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConverterTestDataProvider {

	double celsius;
	double fahrenheit;


	@DataProvider(name = "fahrenheit-arguments")
	public Object [][] provideFahrenheitArguments(){
		return new Object[][] {{0.0, 32.0},{10.0, 50.0},{100.00, 212.0}, {-40, -40}, {-273.15, -459.67}};
	}

	@Test(dataProvider = "fahrenheit-arguments")
	public void testMultipleArguments(double expected ,double fahrenheit){		
		
		celsius = FahrenheitConverter.fahrenheitToCelsius(fahrenheit);
		assertEquals(expected, celsius);
	}
	
}
	
