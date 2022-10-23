package com.cacheImplementation;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class LRUCacheImplementation {
	  int capacityOfCache = 5;
	  HashMap<Integer, CachedObjects> keyMaps = new HashMap<>();
	  Deque<Integer> cacheList = new LinkedList();

	public static void main(String[] args) {
		LRUCacheImplementation instance = new LRUCacheImplementation();
		System.out.println(instance.cacheList.size());
		for(int i=0;i<5;i++)
			instance.fillFirstCache();
		System.out.println(instance.cacheList.size());
		Integer lastElemKey = instance.cacheList.getLast();
		System.out.println(lastElemKey);
		CachedObjects elementFromCache = instance.getElementFromCache(2);
		System.out.println(elementFromCache.getKey());
		System.out.println(instance.cacheList.size());
	}

	/**
	 * @param requestKey
	 * @return
	 */
	public CachedObjects getElementFromCache(Integer requestKey) {
		
		if (keyMaps.containsKey(requestKey)) {// cache hit
			CachedObjects cache = keyMaps.get(requestKey);
			cacheList.remove(cache.getKey());
			cacheList.addFirst(cache.getKey());
			return cache;
		} else {
			if (cacheList.size() >= capacityOfCache) {
				keyMaps.remove(cacheList.removeLast());
			}
			// cache miss scenario
			return fillFirstCache();
		}
	}

	/**
	 * @return
	 */
	private CachedObjects fillFirstCache() {
		CachedObjects cache = new CachedObjects(ThreadLocalRandom.current().nextInt(), "NareshBhabat");
		cacheList.addFirst(cache.getKey());
		keyMaps.put(cache.getKey(), cache);
		return cache;
	}

} 
class CachedObjects {
	/**
	 * @param key
	 * @param value
	 */
	public CachedObjects(Integer key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	Integer key=0;
	String value ="Naresh";
}
