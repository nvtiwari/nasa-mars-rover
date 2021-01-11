package gov.nasa.rover.modules.photo.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**. 
 * Serialized Camera bean standard class to hold Camera/Rover Id specific objects and respective getter/setters/names.
 * @author Nav Tiwari 
 */

public class Camera implements Serializable {
	
	private static final long serialVersionUID = -6780401783898207216L;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("name")
    private String name;
	
	@JsonProperty("rover_id")
    private Long roverId;
	
	@JsonProperty("full_name")
    private String fullName;
    
	public Camera() {}
	
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
	public Long getRoverId() {
		return roverId;
	}
	public void setRoverId(Long roverId) {
		this.roverId = roverId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}