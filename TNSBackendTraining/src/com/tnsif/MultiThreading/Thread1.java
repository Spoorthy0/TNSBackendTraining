package com.tnsif.MultiThreading;

public class Thread1 extends Thread {
	Threadcom tc;
	public Thread1(Threadcom tc) {
		super();
		this.tc=tc;
	}
	public void run() {
		for(int j=1;j<5;j++) {
			tc.deliver(j);
		}
	}

}
