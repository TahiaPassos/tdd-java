package palindrome;

public class StringTest {

	public static void main(String[] args) {
		
		String phrase = "  ";
		phrase = phrase.toLowerCase();
		String reversePhrase = new StringBuffer(phrase).reverse().toString();
		
		System.out.println(phrase.equals(reversePhrase)); 
		
		
		}
	}
	



