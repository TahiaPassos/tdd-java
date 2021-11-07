package palindrome;

public class Palindrome {

	public static Boolean isPalindrome(String phrase) {
		
		phrase = phrase.toLowerCase();
		
		if(phrase.trim().equals("")) return false;
		
		String reversePhrase = new StringBuffer(phrase).reverse().toString();
		
		return phrase.equals(reversePhrase);
			
	}

	
}
