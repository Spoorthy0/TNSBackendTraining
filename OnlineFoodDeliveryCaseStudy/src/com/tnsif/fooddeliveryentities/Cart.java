package com.tnsif.fooddeliveryentities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
   private Map<FoodItem,Integer> items=new HashMap<>();

   public Cart() {
	   super();
    }
   public void addItem(FoodItem fooditem,int quantity) {
        items.put(fooditem, quantity);
   }
   public void removeitem(FoodItem fooditem) {
	   items.remove(fooditem);
   }
   public Map<FoodItem, Integer> getItems() {
	return items;
   }
@Override
public String toString() {
	return "Cart : item=" + items;
}
   
   
}
   