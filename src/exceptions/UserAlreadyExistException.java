package exceptions;

public class UserAlreadyExistException extends RuntimeException {

	public UserAlreadyExistException(String msg) {
		super(msg);
	}

}
