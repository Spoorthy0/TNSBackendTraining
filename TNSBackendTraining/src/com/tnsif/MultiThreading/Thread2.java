package com.tnsif.MultiThreading;

public class Thread2 extends Thread {
	Threadcom tc;
	public Thread2(Threadcom tc) {
		super();
		this.tc=tc;
	}
	public void run() {
		for(int j=1;j<5;j++) {
			tc.receive();
		}
	}

}
