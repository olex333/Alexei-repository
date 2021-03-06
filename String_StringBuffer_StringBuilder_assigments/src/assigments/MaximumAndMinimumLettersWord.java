package assigments;

import java.util.Scanner;

public class MaximumAndMinimumLettersWord {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		MaxAndMinLengthWords(str);
		
		sc.close();

	}
	
	public static void MaxAndMinLengthWords(String str) {
		String[] words = str.split(" ");
		String maxWord = "";
		String minWord = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() > maxWord.length()) {
				maxWord = words[i];
			}
			
			if(words[i].length() < minWord.length()) {
				minWord = words[i];
			}
			
			
		}
		System.out.println("Max lengh word is " + maxWord);
		System.out.println("Min lengh word is " + minWord);
	}

}
