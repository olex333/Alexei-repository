package assigments;

public class Palindrome {

	public static void main(String[] args) {
		for (int i = 100; i<1000; i++) {
			if (isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPalindrome(int n) {
		if ( n < 100 || n > 999) {
			return false;
		}
		int a = n % 10;
		int b = n / 100;
		if (a == b) {
			return true;
		}
		return false;
		
	}

}
