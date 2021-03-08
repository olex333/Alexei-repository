package assigment;


public class ValidatorLogic {
	
	public boolean isValidPassportNumber(String passportNumber) throws InvalidPassportNumber {
		if(!passportNumber.matches("[P]{1}[0-9]{7}")) {
			throw new InvalidPassportNumber("Entered " + passportNumber + " is incorrect passport number");
		}
		
		return true;
	}
	
	
	public boolean isValidDLNumber(String dlnumber) {
		
		if(!dlnumber.matches("[0-9]{9}")) {
			throw new InvalidDriverLicense("Entered driver license "+dlnumber+" is invalid");
		}
		
		return true;
	}

}
