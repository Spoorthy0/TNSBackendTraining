package com.tnsif.fooddeliveryentities;

public class DeliveryPerson {
    private int deliveryPersonid;
    private String name;
    private long contactNo;
	public DeliveryPerson(int deliveryPersonid, String name, long contactNo) {
		super();
		this.deliveryPersonid = deliveryPersonid;
		this.name = name;
		this.contactNo = contactNo;
	}
	public int getDeliveryPersonid() {
		return deliveryPersonid;
	}
	public String getName() {
		return name;
	}
	public long getContactNo() {
		return contactNo;
	}
	@Override
	public String toString() {
	    return  name;
	}
	
}
