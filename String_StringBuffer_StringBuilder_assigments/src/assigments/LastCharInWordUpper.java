package assigments;

import java.util.Scanner;

public class LastCharInWordUpper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		lastCharUpper(str);
		
		sc.close();

	}
	
	public static void lastCharUpper(String str) {
		String[] words = str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i].substring(0,(words[i].length() - 1))).append(
					Character.toUpperCase(words[i].charAt(words[i].length() - 1))).append(" ");
		}
		System.out.println(sb.toString());
	}

}
