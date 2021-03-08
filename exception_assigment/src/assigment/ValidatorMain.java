package assigment;

public class ValidatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidatorLogic vl = new ValidatorLogic();
		try {
			if (vl.isValidPassportNumber("P1234567")) {
				System.out.println("Age validated");
			}
		} catch (InvalidPassportNumber e) {
			System.out.println(e.getMessage());
		}

		try {
			if (vl.isValidDLNumber("1234567")) {
				System.out.println("Valid number");
			}
		} catch (InvalidDriverLicense e) {
			System.out.println(e.getMessage());

		}

	}
}
