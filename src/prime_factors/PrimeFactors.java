package prime_factors;

public class PrimeFactors {
	
	int [] factors;

	public  Object findPrimeFactors(int primeNumbers) {
				
			if(primeNumbers == 1) {
				return new int[0];
			}
			
			factors = new int[1];
			factors[0] = 2;
			
			return factors[0];
	}

	
}
