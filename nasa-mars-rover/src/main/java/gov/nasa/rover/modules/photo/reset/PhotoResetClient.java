package gov.nasa.rover.modules.photo.reset;

import static gov.nasa.rover.modules.photo.common.Constants.AND;
import static gov.nasa.rover.modules.photo.common.Constants.API_KEY;
import static gov.nasa.rover.modules.photo.common.Constants.APPLICATION_PROPERTIES_PATH;
import static gov.nasa.rover.modules.photo.common.Constants.CAMERA;
import static gov.nasa.rover.modules.photo.common.Constants.EARTH_DATE;
import static gov.nasa.rover.modules.photo.common.Constants.EQUAL;
import static gov.nasa.rover.modules.photo.common.Constants.GET;
import static gov.nasa.rover.modules.photo.common.Constants.QUESTION;
import static gov.nasa.rover.modules.photo.common.Constants.ROVER_PHOTO_END_POINT;

import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import gov.nasa.rover.modules.photo.cache.CacheManager;
import gov.nasa.rover.modules.photo.exception.RoverPhotoException;

/**
 * PhotoResetClient class to manage application properties path and cache-manager instance for URL API Call.
 * 
 * @author Nav Tiwari 
 */

public class PhotoResetClient {
	Properties properties=null;
	
	public PhotoResetClient() throws RoverPhotoException {
		properties=new Properties();
		try {
			FileReader reader=new FileReader(APPLICATION_PROPERTIES_PATH);  
			properties.load(reader);
		}catch(IOException ioe) {
			throw new RoverPhotoException(ioe.getMessage(),ioe);
		}
	}
	
	public HttpURLConnection getPhotoCallback(String earthDate,String cameraName) throws IOException {
		HttpURLConnection response=null; 
		StringBuilder url=new StringBuilder();
		// Append application specific constants and properties.
		url.append(properties.get(ROVER_PHOTO_END_POINT)).
		append(QUESTION).append(API_KEY).append(EQUAL).append(properties.get(API_KEY)).
		append(AND).append(EARTH_DATE).append(EQUAL).append(earthDate).
		append(AND).append(CAMERA).append(EQUAL).append(cameraName);
        // Initialize or get Cache-Manager instance.
		if(CacheManager.getInstance().get(url)==null) {
			URL apiCall = new URL(url.toString());
			response = (HttpURLConnection)apiCall.openConnection();
			response.setRequestMethod(GET);
			response.setUseCaches(false); 
			response.connect();
			CacheManager.getInstance().put(url, response);
		}
		else {
			response=CacheManager.getInstance().get(url);
		}
		return response;
	}
}