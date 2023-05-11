package ec.com.empresa.model.exceptions;

public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(String message) {
		super(message);
	}
	
}
