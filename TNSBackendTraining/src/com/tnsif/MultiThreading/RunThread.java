package com.tnsif.MultiThreading;

public class RunThread implements Runnable {
	   int i;
	   String name;
     public RunThread(String name) {
  	   this.name=name;
     }
     public void run() {
  	   for(int i=0;i<4;i++) {
  		   System.out.println("The name od thread is "+name);
  		   try {
  			   Thread.sleep(1000);
  		   }
  		   catch(InterruptedException e) {
  			   e.getStackTrace();
  		   }
  	   }
     }
}
