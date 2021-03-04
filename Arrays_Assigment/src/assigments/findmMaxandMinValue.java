package assigments;

import java.util.Scanner;

public class findmMaxandMinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("The maximum value in array is " + findMaxValue(ar));
		System.out.println("The minimum value in array is " + findMinValue(ar));


	}
	
	public static int findMaxValue(int ar[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			}
		return max;
	}
	
	public static int findMinValue(int ar[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			}
		return min;
	}


}
