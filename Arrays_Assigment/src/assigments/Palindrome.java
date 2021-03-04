package assigments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for (int i = 0; i < ar.length; i++) {
			if (isPalindrome(ar[i])){
				System.out.println(ar[i]);
			}
		}
	}


	public static boolean isPalindrome(int number) {
		int reverse = 0;
		if (number < 0) {
			number *= -1;
		}
		int num = number;

		while (num != 0) {
			reverse *= 10;
			reverse += num % 10;
			num /= 10;
		}
		if (number == reverse) {
			return true;
		}
		return false;
	}

}
