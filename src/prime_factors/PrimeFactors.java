package prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	List<Integer> factors = new ArrayList<Integer>();

	public  List<Integer> findPrimeFactors(int primeNumbers) {
				
			if(primeNumbers > 1) {
				if(primeNumbers % 2 == 0) {
					factors.add(2);
					primeNumbers /= 2;
				}
				if(primeNumbers > 1) factors.add(primeNumbers);
			}
			
			return factors;
	}

}
