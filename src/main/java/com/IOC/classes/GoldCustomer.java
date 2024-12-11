package com.IOC.classes;

import com.IOC.Address.Address;
import com.IOC.interfaces.Customer;

public class GoldCustomer implements Customer {
	String name;
	String type;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getCustomerType() {
		return name+" is a "+type+" from "+address.getCity()+", "+address.getState();
	}

}
