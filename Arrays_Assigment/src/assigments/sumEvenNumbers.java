package assigments;

import java.util.Scanner;

public class sumEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("The sum of even numbers in array is " + sumEven(ar));

	}


	public static int sumEven(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];
			}

		}
		return sum;
	}

}
