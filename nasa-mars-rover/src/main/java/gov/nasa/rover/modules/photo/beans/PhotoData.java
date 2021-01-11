package gov.nasa.rover.modules.photo.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**. 
 * Serialized PhotoData standard class to hold/get/set list of photo objects. 
 * @author Nav Tiwari 
 */

public class PhotoData {

	@JsonProperty("photos")
	private List<Photos> photos;

	public List<Photos> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}
}