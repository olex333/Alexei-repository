package assigments;

public class Sum {
	public static void main(String[] args) {
		System.out.println("Odd sum is " + sumOdd());
		System.out.println("Odd sum is " + sumEven());
		
	}
	
	public static int sumOdd() {
		int sum = 0;
		for (int i=0;i  < 100; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int sumEven() {
		int sum = 0;
		for (int i=0;i  < 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
