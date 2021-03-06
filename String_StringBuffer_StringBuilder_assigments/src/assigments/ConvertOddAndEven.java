package assigments;

import java.util.Scanner;

//2)Take a sentence as input and for the word with length odd convert the middle character to uppercase and for the word length even convert the
//first character to uppercase.

public class ConvertOddAndEven {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		convertCharUpper(str);
		
		sc.close();

	}
	
	public static void convertCharUpper(String str) {
		String[] words = str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
			sb.append(
					Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
			
			else if (words[i].length() % 2 != 0) {
				sb.append(words[i].substring(0,(words[i].length() / 2))).append(
						Character.toUpperCase(words[i].charAt(words[i].length() / 2))).append(words[i].substring(((words[i].length() / 2)+1))).append(" ");
			}
			}
		System.out.println(sb.toString());
	}

}
