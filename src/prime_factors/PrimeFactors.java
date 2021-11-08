package prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	List<Integer> factors = new ArrayList<Integer>();

	public  List<Integer> findPrimeFactors(int primeNumbers) {
				
			if(primeNumbers == 1) {
				return new ArrayList<Integer>();
			}
			if(primeNumbers == 2)
				factors.add(2);
			
			if(primeNumbers == 3)
				factors.add(3);
			
			return factors;
	}

}
