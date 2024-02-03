package com.StandAloneCollections.List;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Person {
	private List<String> friends;
	private Map<String, Integer> fee;
	private Properties property;

	public Map<String, Integer> getFee() {
		return fee;
	}

	public void setFee(Map<String, Integer> fee) {
		this.fee = fee;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "List [friends=" + friends + "\nMap=" + fee + "\nProperties=" + property + "]";
	}

	

}
