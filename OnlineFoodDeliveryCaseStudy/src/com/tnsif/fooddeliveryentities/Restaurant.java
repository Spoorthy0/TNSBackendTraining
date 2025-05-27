package com.tnsif.fooddeliveryentities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
   private int id;
   private String name;
   private List<FoodItem> menu=new ArrayList<>();
   public Restaurant(int id, String name) {
	 super();
	 this.id = id;
	 this.name = name;
    }
   public int getId() {
	return id;
     }
   public String getName() {
	   return name;
    }
  public List<FoodItem> getMenu() {
	return menu;
    }
@Override
  public String toString() {
	return "Restaurant Id=" + id + ", Name=" + name + ", menu=" + menu ;
    }
  public void addFoodItem(FoodItem fooditem) {
	  menu.add(fooditem);
  }  
  public void removeFooditem(int index) {
	  menu.remove(index);
  }

  

   
   
}
