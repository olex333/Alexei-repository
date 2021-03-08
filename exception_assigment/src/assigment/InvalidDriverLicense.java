package assigment;

//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.

public class InvalidDriverLicense extends RuntimeException {

	public InvalidDriverLicense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDriverLicense(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
