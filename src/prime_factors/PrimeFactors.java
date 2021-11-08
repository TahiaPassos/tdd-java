package prime_factors;

public class PrimeFactors {
	
	int [] factors = new int[1];

	public  Object findPrimeFactors(int primeNumbers) {
				
			if(primeNumbers == 1) {
				return new int[0];
			}
			if(primeNumbers == 2)
				factors[0] = 2;
			
			if(primeNumbers == 3)
				factors[0] = 3;
			
			
			return factors[0];
	}

}
