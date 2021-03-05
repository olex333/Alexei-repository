package assigments;
import java.util.Scanner;

public class CountOfVowels {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int count = countVowels(str);
		System.out.println(count);
		
	}
	
	public static int countVowels(String str) {
		int count=0;
		String str1 = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' ||
					str1.charAt(i) == 'o' || str1.charAt(i) == 'u' ) {
				count++;
			}
		}
			
		return count;
	}

}
