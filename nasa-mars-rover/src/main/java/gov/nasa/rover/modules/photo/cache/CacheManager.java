package gov.nasa.rover.modules.photo.cache;

import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The CacheManager class instance is a Synchronized Map implementation to manage cache keys and HTTP connection values.  
 * 
 * @author Nav Tiwari 
 */

public final class CacheManager {

	private static CacheManager instance;
	private static Object monitor = new Object();
	private Map<StringBuilder, HttpURLConnection> cache = Collections.synchronizedMap(new HashMap<StringBuilder,HttpURLConnection>());

	private CacheManager() {
	}

	public void put(StringBuilder cacheKey,  HttpURLConnection value) {
		cache.put(cacheKey, value);
	}

	public HttpURLConnection get(StringBuilder cacheKey) {
		return cache.get(cacheKey);
	}

	// TODO: Introduce Map size/capacity specific constraint to have cache replacement policy for least recently used cacheKeys. 
	public void removeKey(StringBuilder cacheKey) {
		cache.put(cacheKey, null);
	}

	public void clear() {
		cache.clear();
	}

	public static CacheManager getInstance() {
		if (instance == null) {
			synchronized (monitor) {
				if (instance == null) {
					instance = new CacheManager();
				}
			}
		}
		return instance;
	}
}