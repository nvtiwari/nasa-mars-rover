package gov.nasa.rover.modules.photo.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nasa.rover.modules.photo.beans.PhotoData;
import gov.nasa.rover.modules.photo.exception.RoverPhotoException;

/**
 * General utility class to hold reusable methods for java object data-type conversion i.e. 
 * JSON-> Object || Object -> JSON || Date -> String  and get calendar date. 
 * 
 * 1.) NOTE:: Please add new reusable method in the class here to avoid code-duplication and promote re-usability.
 * 2.) TODO :: Add a new UtilTest class to assert and validate behavior of existing methods.
 * 
 * @author Nav Tiwari 
 */

public class Util {
	
	public static List<PhotoData> convertJsonIntoObject(String json) throws JsonMappingException, JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeReference<List<PhotoData>> mapType=new TypeReference<List<PhotoData>>(){};
		List<PhotoData> list = mapper.readValue(json, mapType);
		return list;
	}
	
	public static String convertObjectIntoJSON(Map<String, ArrayList<String>> resultMap) throws RoverPhotoException{
		String json=null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			json = objectMapper.writeValueAsString(resultMap);
		} catch (JsonProcessingException e) {
			throw new RoverPhotoException(e.getMessage(),e);
		}
		return json;
	}
	
	public static String convertDateToSting(Date date) {
		if(date==null) {
			date=new Date();
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(date);
	}
	
	public static Date getDate(int day) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -day);
		return cal.getTime();
	}
}