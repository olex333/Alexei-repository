package assigments;

import java.util.Scanner;

public class CharAtPrimeIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		printPrimeIndex(str);
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeIndex(String str) {
		String str1 = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			if (isPrime(i)) {
				System.out.println(i + " index " +str1.charAt(i));
			}
			
		}
	}

}
