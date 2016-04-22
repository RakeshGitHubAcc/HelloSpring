package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List addressList;
	Set  addressSet;
	Map  addressMap;
	Properties addressProp;
	// prints and returns all the elements of the list.
	public List getAddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	 // prints and returns all the elements of the Set.
	public Set getAddressSet() {
		System.out.println("Set Elements :"  + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	// prints and returns all the elements of the Map.
	public Map getAddressMap() {
		System.out.println("Map Elements :"  + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	// prints and returns all the elements of the Property.
	public Properties getAddressProp() {
		System.out.println("Property Elements :"  + addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
}
