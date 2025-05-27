package com.tnsif.fooddeliveryentities;

public class FoodItem {
    private int Id;
    private String name;
    private double price;
	public FoodItem(int id, String name, double price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem Id=" + Id + ", Name=" + name + ", Price=" + price ;
	}
	
    
}
