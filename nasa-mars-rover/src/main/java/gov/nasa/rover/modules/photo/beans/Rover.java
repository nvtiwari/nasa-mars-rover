package gov.nasa.rover.modules.photo.beans;

/**
 * @author Nav
 * 
 */
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**. 
 * Serialized Rover  class for object properties such as name, landing-date, launch-date and status.
 * @author Nav Tiwari 
 */
public class Rover implements Serializable {
	
	private static final long serialVersionUID = 5170486564689034671L;
	
	@JsonProperty("id")
    private Long id;
	
	@JsonProperty("name")
    private String name;
	
	@JsonProperty("landing_date")
    private String landingDate;
	
	@JsonProperty("launch_date")
    private String launchDate;
	
	@JsonProperty("status")
	private String status;

	public Rover() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(String landingDate) {
		this.landingDate = landingDate;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}