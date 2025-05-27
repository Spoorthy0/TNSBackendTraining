package com.tnsif.fooddelivery.application;

import java.util.Scanner;

import com.tnsif.fooddeliveryentities.*;
import com.tnsif.fooddelivery.services.*;

public class FoodDeliverySystem {

	static Scanner sc= new Scanner(System.in);
	static int orderIdCounter=1;   
    public static void main(String[] args) {
    	FoodService foodService= new FoodService();
    	OrderService order=new OrderService();
    	CustomerService customer=new CustomerService();
        while (true) { 
            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    adminMenu(foodService,order);
                    break;
                case 2:
                    customerMenu(customer,order,foodService);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void adminMenu(FoodService foodService,OrderService order) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Enter Restaurant ID : ");
                	int id=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter Restaurant Name:  ");
                	String name=sc.nextLine();
                    foodService.addRestaurants(new Restaurant(id,name));
                    break;
                case 2:
                	System.out.println("Enter Restaurant ID: ");
                	int id1=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter food Item ID: ");
                	int foodid=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter the food Item Name: ");
                	String foodName=sc.nextLine();
                	System.out.println("Enter the food Item Price: ");
                	double price=sc.nextDouble();
                    foodService.addFoodItemtoRestaurant(id1,new FoodItem(foodid,foodName,price));
                    break;
                case 3:
                	System.out.println("Enter the restaurant ID: ");
                	int resId=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter the FoodId to remove: ");
                	int foodId=sc.nextInt();
                	sc.nextLine();
                    foodService.removeFoodItemfromRestaurant(resId,foodId);
                    break;
                case 4:
                    for(Restaurant r:foodService.getRestaurants()) {
                    	System.out.println(r);
                    };
                    break;
                case 5:
                    order.getOrderList();
                    break;
                case 6:
                	System.out.println("Enter delivery person ID: ");
                	int did=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter the delivery person name: ");
                	String dname=sc.nextLine();
                	System.out.println("Enter Contact No: ");
                	long dcontactNo=sc.nextLong();
                	sc.nextLine();
                	order.addDeliveryPerson(new DeliveryPerson(did,dname,dcontactNo));
                    break;
                case 7:
                	System.out.println("Enter the order ID: ");
                	int orderid=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter the DeliveryPerson ID: ");
                	int deid=sc.nextInt();
                    order.assignOrdertoDeliveryPerson(orderid,deid);
                    System.out.println("Delivery person assigned to order successfully!");
                    break;
                case 8:
                	System.out.println("Exiting Admin Module");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void customerMenu(CustomerService customer,OrderService order,FoodService foodService) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            Customer cust;
            Order orders;
            Cart cart;

            switch (choice) {
                case 1:
                	System.out.println("Enter the User ID: ");
                	int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter UserName: ");
                    String name=sc.nextLine();
                    System.out.println("Enter ContactNo: ");
                    long contact=sc.nextLong();
                    customer.addCustomer(new Customer(id,name,contact));
                    System.out.println("Customer created successfully!!");
                    break;
                case 2:
                	for(Restaurant r:foodService.getRestaurants()) {
                    	System.out.println(r);
                    };
                    break;
                case 3:
                	System.out.println("Enter Customer ID: ");
                	int cusid=sc.nextInt();
                	sc.nextLine();
                	cust=customer.getCustomer(cusid);
                	if(cust!=null) {
                	System.out.println("Enter Restuarant ID: ");
                	int resid=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter FoodItem ID: ");
                	int foodid=sc.nextInt();
                	sc.nextLine();
                	System.out.println("Enter Quantity");
                	int quant=sc.nextInt();
                    	if(foodService.FoodItemById(foodid)!=null) {
                    		cust.getCart().addItem(foodService.FoodItemById(foodid), quant);
                    		System.out.println("Item added to cart");
                    	}
                    	else {
                    		System.out.println("FoodItem not found");
                    	}       
                    }
                    else {
                    	System.out.println("Customer not found!!");
                    }
                	break;
                case 4:
                	System.out.println("Enter customer ID: ");
                	int cid=sc.nextInt();
                	sc.nextLine();
                	cust=customer.getCustomer(cid);
                    if (cust != null) {
                        cart=cust.getCart();
                    if(cart!=null && !cart.getItems().isEmpty()) {
                    	System.out.println("Cart "+cart);
                          }
                    }
                    else
                        System.out.println("Please register first.");
                    break;
                case 5:
                	System.out.println("Enter Customer ID: ");
                	int csid=sc.nextInt();
                    sc.nextLine();
                    cust=customer.getCustomer(csid);
                    if (cust!= null) {
                    	orders=new Order(orderIdCounter++,cust);
                    	cart=cust.getCart();
                    	if(cart!=null && !cart.getItems().isEmpty()) {
                    		orders.setItems(cart.getItems());
                    		order.addOrder(orders);
                    		System.out.println("Order placed successfully!Your order ID is: "+orderIdCounter);
                    	}
                    	else {
                    		System.out.println("Your cart is empty");
                    	}
                    }                                     
                    else
                        System.out.println("Please register first.");
                    break;
                case 6:
                	if(order!=null) {
                    for(Order or: order.getOrderList()) {
                    	System.out.println(or);
                    }
                    }
                    break;
                case 7:
                	System.out.println("Exiting Customer menu");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }           

		

	}
                        

