package com.tnsif.fooddeliveryentities;

import java.util.HashMap;
import java.util.Map;

public class Order {
   private int orderId;
   private Customer customer;
   private Map<FoodItem,Integer> items=new HashMap<>();
   private String status="Pending";
   private DeliveryPerson deliveryPerson;
   private String deliveryAddress;
   public Order(int orderId, Customer customer) {
	super();
	this.orderId = orderId;
	this.customer = customer;
     }
  public int getOrderId() {
	return orderId;
    }
  public Customer getCustomer() {
	return customer;
    }
  public Map<FoodItem, Integer> getItems() {
	return items;
    }
  public String getStatus() {
	return status;
    }
  public DeliveryPerson getDeliveryPerson() {
	return deliveryPerson;
    }
  public String getDeliveryAddress() {
	return deliveryAddress;
    }
  public void setOrderId(int orderId) {
	this.orderId = orderId;
    }
  public void setCustomer(Customer customer) {
 	this.customer = customer;
    }
  public void setItems(Map<FoodItem, Integer> items) {
	this.items = items;
    }
  public void setStatus(String status) {
	this.status = status;
    }
  public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
	this.deliveryPerson = deliveryPerson;
    }
  public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
    }
@Override
  public String toString() {
	return "Order: orderId=" + orderId + ", customer=" + customer + ", items=" + items + ", status=" + status
			+ ", deliveryPerson=" + deliveryPerson ;
}
  public void addItem(FoodItem fooditem,int quantity) {
	  items.put(fooditem, quantity);
  }
   
   
}
