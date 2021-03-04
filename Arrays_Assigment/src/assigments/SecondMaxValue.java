package assigments;

import java.util.Scanner;

public class SecondMaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("The second max value is " + find2ndMaxValue(ar));

	}

	public static int find2ndMaxValue(int ar[]) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max) {
				max2 = max;
				max = ar[i];
			} else {
				if (ar[i] > max2) {
					max2 = ar[i];
				}
			}
		}
		return max2;

	}
}
