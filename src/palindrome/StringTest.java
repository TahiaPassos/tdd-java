package palindrome;

public class StringTest {

	public static void main(String[] args) {
		
		String phrase = "mom dad";
		
		System.out.println(phrase.toLowerCase().equals(new StringBuffer(phrase).reverse().toString())); 
		
		System.out.println(phrase);
		System.out.println(new StringBuffer(phrase).reverse().toString());
		
		
		}
	}
	



