package palindrome;

public class Palindrome {

	public static Boolean isPalindrome(Object phrase) {

		if(!(phrase instanceof String)) throw new IllegalArgumentException("input must be a string");
		if(phrase.equals("")) throw new IllegalArgumentException("empty strings are not palindromes");
		if(((String) phrase).trim().equals("")) return false;

		return ((String) phrase).toLowerCase().equals(new StringBuffer((String) phrase).reverse().toString());
			
	}

	
}
