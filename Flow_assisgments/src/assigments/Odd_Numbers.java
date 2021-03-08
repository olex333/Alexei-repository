package assigments;

public class Odd_Numbers {
	public static void main(String[] args) {
		for (int i=100; i<200;i++) {
			if(isOdd(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}
		return false;
	}

}
