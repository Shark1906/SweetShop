// data or model layer
package com.sweetshop.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SweetStore {
	
	Map<String, List> orderMap = new HashMap<>();
	private List<Sweet> sweetList = new ArrayList<>();
	private static SweetStore instance;
	
	private SweetStore() {}
	
	public static SweetStore getInstance() {
		if(instance == null) {
			instance = new SweetStore();
		}
		return instance;
	}
	
	public void add(Sweet sweet) {
		sweetList.add(sweet);
	}
	
	public List getList() {
		return sweetList;
	}
	
	public void removeSweet(Sweet sweet) {
		sweetList.remove(sweet);
	}
	
	public Sweet getSweet(String name) {
		for(Sweet sweet :sweetList) {
			if(sweet.name.equalsIgnoreCase(name)) {
				return sweet;
			}
		}
		return null;
	}
}
