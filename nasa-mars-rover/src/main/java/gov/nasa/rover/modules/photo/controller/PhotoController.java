package gov.nasa.rover.modules.photo.controller;

import java.util.ArrayList;
import java.util.Map;

import gov.nasa.rover.modules.photo.exception.RoverPhotoException;
import gov.nasa.rover.modules.photo.service.PhotoService;
import gov.nasa.rover.modules.photo.service.PhotoServicesImpl;

/**
 * PhotoController class for Rest API resources to be consumed. 
 * This class can be enhanced to support new web-application functionality.
 * 
 * @author Nav Tiwari 
 */

public class PhotoController {
	
	private PhotoService photoService=null;
	
	public PhotoController() throws RoverPhotoException {
		photoService=new PhotoServicesImpl();
	}
	
	public  Map<String, ArrayList<String>> getLastTenDaysPhotos() throws RoverPhotoException {
		return photoService.getLastTenDaysPhotos();
	}
}