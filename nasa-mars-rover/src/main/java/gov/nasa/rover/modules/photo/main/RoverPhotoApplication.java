package gov.nasa.rover.modules.photo.main;

import gov.nasa.rover.modules.photo.common.Util;
import gov.nasa.rover.modules.photo.controller.PhotoController;
import gov.nasa.rover.modules.photo.exception.RoverPhotoException;

/**
 * The RoverPhotoApplication class is the Main API entry point to implements an application to
 * display daily images from NASA MARS Curiosity rover. This API gets images for last 10 days
 * with the limitation of MAX-3 Images per day. 
 * 
 * @author Nav Tiwari 
 */

public class RoverPhotoApplication{

	public static void main(String[] args) {
		try {
			PhotoController photoController=new PhotoController();
			//TODO: Output JSON could be pretty-printed/linted based on user-request.
			System.out.println(Util.convertObjectIntoJSON(photoController.getLastTenDaysPhotos()));
		} 
		catch(RoverPhotoException rpe) {
			System.err.println("Error Message :: " + rpe.getMessage());
		}
	}
}


