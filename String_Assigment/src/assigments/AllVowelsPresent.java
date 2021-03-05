package assigments;

import java.util.Scanner;

public class AllVowelsPresent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(AllVowelsPres(str));
	}
	
	public static boolean AllVowelsPres(String str) {
		String str1 = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str1.contains("a") && str1.contains("e") && str1.contains("i")  &&
					str1.contains("o") && str1.contains("u") ) {
				return true;
			}
		}
			
		return false;
	}
}
