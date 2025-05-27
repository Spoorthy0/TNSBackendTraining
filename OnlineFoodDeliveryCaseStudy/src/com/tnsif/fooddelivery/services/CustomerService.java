package com.tnsif.fooddelivery.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.fooddeliveryentities.Customer;

public class CustomerService {
    private List<Customer> customerList=new ArrayList<>();
    public void addCustomer(Customer customer) {
    	customerList.add(customer);
    	
    }
	public List<Customer> getCustomerList() {
		return customerList;
	}
    public Customer getCustomer(int userId) {
    	for(Customer customer:customerList) {
    		if(customer.getUserId()==userId){
    			return customer;
    		}
    	}
    	return null;
    }
    
	
    
}
