package com.tnsif.MultiThreading;

public class ThreadSync extends Thread {
	 synchronized public static void add(int n) throws InterruptedException {
		 
		for(int i=0;i<5;i++) {
			System.out.println(n+i);
			Thread.sleep(1000);
	
		 }
	 }		 

}
