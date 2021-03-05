package assigment;

public class validation {
	public static void main(String[] args) {
		String S = "123456789";
		dlValidation(S);
		
	}
	
	public static void passportValidation(String str) {
		if(str.matches("[P]{1}[0-9]{7}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	
	public static void ssnValidation(String str) {
		if(str.matches("[0-9]{9}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	
	public static void dlValidation(String str) {
		if(str.matches("[0-9]{9}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
