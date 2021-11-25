// data or model layer
package com.sweetshop.demo;

import java.util.HashSet;
import java.util.Set;

public class SweetStore {
	
	private Set<Sweet> sweetList = new HashSet();
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
	
	public Set getList() {
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
