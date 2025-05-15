
package com.tnsif.MultiThreading;
public class ThreadMain1 {
	public static void main(String[] args) {
		Threadcom tc=new Threadcom();
		Thread1 t1=new Thread1(tc);
		Thread2 t2=new Thread2(tc);
		t1.start();
		t2.start();

	}

}
