package gov.nasa.rover.modules.photo.service;

import java.util.ArrayList;
import java.util.Map;
import gov.nasa.rover.modules.photo.exception.RoverPhotoException;

/**
 * PhotoService java interface to hold service interface methods to extract last 10 days of rover-photos.
 * New service method needs to be added in this interface o add new service functionality specific to rover, 
 * camera, images etc.
 * 
 * @author Nav Tiwari 
 */

public interface PhotoService {

	public Map<String, ArrayList<String>> getLastTenDaysPhotos() throws RoverPhotoException;

}
