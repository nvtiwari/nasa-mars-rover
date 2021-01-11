package gov.nasa.rover.modules.photo.exception;

/**
 * RoverPhotoException class to manage runtime exceptions related to rover images
 * @author Nav Tiwari 
 */

public class RoverPhotoException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public RoverPhotoException(String errorMessage, Exception e) {
		super(errorMessage, e);
	}

	public RoverPhotoException(String errorMessage) {
		super(errorMessage);
	}

	public RoverPhotoException(Exception e) {
		super(e);
	}
}
