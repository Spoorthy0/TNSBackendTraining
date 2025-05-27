package com.tnsif.fooddelivery.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.fooddeliveryentities.FoodItem;
import com.tnsif.fooddeliveryentities.Restaurant;

public class FoodService {
     private List<Restaurant> restaurants=new ArrayList<>();
     public void addRestaurants(Restaurant restaurant) {
    	 boolean flag=false;
    	 for(Restaurant rs:restaurants) {
    		 if(rs.getId()==restaurant.getId()) {
    			 System.out.println("Restaurant already exists!!");
    			 flag=true;
    			 break;
    		 }
    	 }
    	     if(!flag){
                 restaurants.add(restaurant);
                 System.out.println("Restaurant added successfully!!");
                 } 	     
     }
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public List<FoodItem> getAllFoodItems(){
		List<FoodItem> allFoodItems = new ArrayList<>();
		for(Restaurant restaurant : restaurants) {
			allFoodItems.addAll(restaurant.getMenu());
		}
		return allFoodItems;
		}
	public FoodItem FoodItemById(int foodId) {
		for(Restaurant restaurant:restaurants) {
			for(FoodItem item:restaurant.getMenu()) {
				if(item.getId()==foodId) {
					return item;
				}
			}
		}
		return null;
	}
	public void addFoodItemtoRestaurant(int restaurantId,FoodItem fooditem) {
		boolean flag=false;
		for(Restaurant r:restaurants) {
			if(r.getId()==restaurantId) {
				r.addFoodItem(fooditem);
				System.out.println("Food Item added successfully!!");
				flag=true;
				break;
			}
		}
			if(!flag){
				System.out.println("Restaurant with ID "+restaurantId+" not found");
		}
		
		
	}
	public void removeFoodItemfromRestaurant(int restaurantId,int fooditemid) {
		boolean flag=false;
		for(Restaurant r:restaurants) {
			if(r.getId()==restaurantId) {
				List<FoodItem> menu=r.getMenu();
				if(fooditemid>=0 && fooditemid<menu.size()) {
				menu.remove(fooditemid);
				System.out.println("Food item removed successfully!");
				flag=true;
				break;
				}
				else {
					System.out.println("Invalid food item index");
				}
			}
			if(!flag) {
				System.out.println("Restaurant with ID "+restaurantId+" not found");
			}
		}
	}
}