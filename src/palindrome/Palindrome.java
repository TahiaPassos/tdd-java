package palindrome;

public class Palindrome {

	public static Boolean isPalindrome(String phrase) {
		
	
		if(phrase.equals("")) throw new IllegalArgumentException("empty strings are not palindromes");
		if(phrase.trim().equals("")) return false;

		return phrase.toLowerCase().equals(new StringBuffer(phrase).reverse().toString());
			
	}

	
}
