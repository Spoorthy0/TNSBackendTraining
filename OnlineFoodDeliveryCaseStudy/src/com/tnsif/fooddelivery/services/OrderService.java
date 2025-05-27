package com.tnsif.fooddelivery.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.fooddeliveryentities.DeliveryPerson;
import com.tnsif.fooddeliveryentities.Order;

public class OrderService {
  public int orderIdCounter;
  private List<Order> orderList=new ArrayList<>();
  private List<DeliveryPerson> deliveryPersons=new ArrayList<>();
  public void addOrder(Order orderid) {
	  orderList.add(orderid);
  }

public List<Order> getOrderList() {
	return orderList;
}
public void addDeliveryPerson(DeliveryPerson deliveryperson) {
	deliveryPersons.add(deliveryperson);
	System.out.println("DeliveryPerson added successfully!");
}
public void assignOrdertoDeliveryPerson(int orderId,int deliveryPersonId) {
	
	for(Order order:orderList) {
		if(order.getOrderId()==orderId) {
			for(DeliveryPerson dp:deliveryPersons) {
				if(dp.getDeliveryPersonid()==deliveryPersonId) {
					order.setDeliveryPerson(dp);
					order.setStatus("Assigned");
					System.out.println("Delivery person assigned successfully!");
				}
			}
		}
	}
	
}
  
}
