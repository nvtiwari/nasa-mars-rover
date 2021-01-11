package gov.nasa.rover.modules.photo.service;

import static gov.nasa.rover.modules.photo.common.Util.convertDateToSting;
import static gov.nasa.rover.modules.photo.common.Util.convertJsonIntoObject;
import static gov.nasa.rover.modules.photo.common.Util.getDate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import gov.nasa.rover.modules.photo.beans.PhotoData;
import gov.nasa.rover.modules.photo.beans.Photos;
import gov.nasa.rover.modules.photo.common.Constants;
import gov.nasa.rover.modules.photo.exception.RoverPhotoException;
import gov.nasa.rover.modules.photo.reset.PhotoRestClient;

/**
 * PhotoServicesImpl is a java service class to hold application services class by implementing PhotoService
 * interface. THis class provides and extract rover photo lists. This service class facilitate a framework 
 * of enhancement to support multiple rover and cameras. 
 * 
 * @author Nav Tiwari 
 */

public class PhotoServicesImpl implements PhotoService{
	
	private PhotoRestClient photoRestClient=null;
	private static final String NAVCAM  = "NAVCAM";
	
	public PhotoServicesImpl() throws RoverPhotoException {
		photoRestClient=new PhotoRestClient();
	}
	
	public Map<String, ArrayList<String>> getLastTenDaysPhotos() throws RoverPhotoException{
		Map<String, ArrayList<String>> resultMap=new LinkedHashMap<String, ArrayList<String>>();
		try {
			for(int i=0;i<10;i++) {
				String earthDate=convertDateToSting(getDate(i));
				List<PhotoData> photoDataList=getRoverPhotoList(earthDate,NAVCAM);
				filterPhotoList(earthDate,photoDataList, resultMap);
			}
		} catch(Exception e) {
			throw new RoverPhotoException(e.getMessage(),e);
		}
		return resultMap;
	}
	
	private List<PhotoData> getRoverPhotoList(String earthDate,String cameraName) throws RoverPhotoException{

		List<PhotoData> photoList=null;
		try {
			HttpURLConnection response=photoRestClient.getPhotoCallback(earthDate,cameraName);
			int status=response.getResponseCode();
			switch(status) {
			case Constants.SUCCESS_CODE:
				BufferedReader in = new BufferedReader( new InputStreamReader(response.getInputStream()));
				photoList=convertJsonIntoObject(in.readLine());
				in.close();
				break;
			default:
				System.err.println("unable to processed with status code " + status);
			}
		} catch (Exception e) {
			throw new RoverPhotoException(e.getMessage(),e);
		}
		return photoList;
	}
	
	private Map<String, ArrayList<String>> filterPhotoList(String earthDate,List<PhotoData> photoDataList,Map<String, ArrayList<String>> resultMap){
		List<Photos> photoList=photoDataList.get(0).getPhotos();
		if(photoList!=null) {
			if(photoList.isEmpty()) {
				resultMap.put(earthDate, new ArrayList<String>());
			}else {
				for(Photos photo: photoDataList.get(0).getPhotos()) {
					if(resultMap.get(earthDate)==null) {
						ArrayList<String> list = new ArrayList<String>();
						list.add(photo.getImgSrc());
						resultMap.put(earthDate, list);
					}else if(resultMap.get(earthDate).size()<3) {
						ArrayList<String> list =resultMap.get(earthDate);
						list.add(photo.getImgSrc());
						resultMap.put(earthDate, list);
					}
				}
			}
		}
		return resultMap;
	}
}