package palindrome;

public class Palindrome {

	public static Boolean isPalindrome(String phrase) {
		
		phrase = phrase.toLowerCase();
		String reversePhrase = new StringBuffer(phrase).reverse().toString();
		
		return phrase.equals(reversePhrase);
			
	}

	
}
