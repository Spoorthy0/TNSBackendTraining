package com.tnsif.MultiThreading;

public class RunThreadMain {

	public static void main(String[] args) {
	    RunThread t1=new RunThread("Thread1");
	    Thread ob=new Thread(t1);
	    ob.start();

	}

}
