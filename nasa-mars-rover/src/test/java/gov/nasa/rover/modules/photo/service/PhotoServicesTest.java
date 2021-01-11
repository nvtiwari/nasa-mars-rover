package gov.nasa.rover.modules.photo.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

/**
 * PhotoServicesTest class asserts and validate service function to extract last ten days of service-data.
 * 
 * @author Nav Tiwari 
 */

public class PhotoServicesTest{

	private PhotoService photoService=null;
	
	@Before
	public void initialize() {
		photoService=new PhotoServicesImpl();
	}
	
	// TODO: Add date specific assertions to validate map value i.e. list-size outcome for photo-sizes of 0,1,2 or 3.
	@Test
	public void getLastTenDaysPhotos() throws Exception{
		Map<String, ArrayList<String>> resultMap=photoService.getLastTenDaysPhotos();
		assertTrue( (resultMap.keySet().size() == 10) && (!resultMap.keySet().isEmpty()));
		assertFalse(resultMap.values().isEmpty());
		assertTrue((resultMap.size() == 10) && (!resultMap.isEmpty()));
	}
}