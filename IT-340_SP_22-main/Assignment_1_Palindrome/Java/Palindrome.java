
public class Palindrome {
	
	/*
	 * Implement this method and return true if the word is the same 
	 * forward and backwards
	 * Do not use automatic methods for reversing the string
	 */
	private boolean isPalindrome(String word) {

		for(int i = 0; i< word.length(); i++){
			//check the first letter of the word and see if the last one is the same
			if(word.charAt(i) != word.charAt(word.length()-1-i)){
				return false;
			}

		}

		return true;
	}

	//ANALYSIS: 0(N)

	/*
	 * Open up  the file. 
	 * Break into words 
	 *  print out all Palindromes
	 */
	private void findAllPalindromes(String fileName) {
		

	}


	public Palindrome() {
		//run some tests

		if (isPalindrome("racecar")) {
		    System.out.print("pass");
		}
		else {
			 System.out.print("Fail");
		}
		if (isPalindrome("mom")) {
			  System.out.print("pass");
					}
		else {
			 System.out.print("Fail");
		}
		if (isPalindrome("noon")) {
			  System.out.print("pass");
					}
		else {
			 System.out.print("Fail");
		}
				
			}

	public static void main(String[] args) {
		new Palindrome();

	}

}
