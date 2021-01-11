package gov.nasa.rover.modules.photo.beans;

/**
 * @author Nav
 * 
 */
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**. 
 * Serialized Photo  class for object properties such as id, sol, camera, rover, earth_date
 * @author Nav Tiwari 
 */
public class Photos implements Serializable {

	private static final long serialVersionUID = -7189771963956829420L;
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("sol")
    private Long sol;
	
	@JsonProperty("camera")
    private Camera camera;
	
	@JsonProperty("img_src")
    private String imgSrc;
	
	@JsonProperty("earth_date")
    private Date earthDate;
	
	@JsonProperty("rover")
    private Rover rover;

	public Photos() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSol() {
		return sol;
	}

	public void setSol(Long sol) {
		this.sol = sol;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public Date getEarthDate() {
		return earthDate;
	}

	public void setEarthDate(Date earthDate) {
		this.earthDate = earthDate;
	}

	public Rover getRover() {
		return rover;
	}

	public void setRover(Rover rover) {
		this.rover = rover;
	}
}