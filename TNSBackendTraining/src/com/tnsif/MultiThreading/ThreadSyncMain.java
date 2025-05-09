package com.tnsif.MultiThreading;

public class ThreadSyncMain {

	public static void main(String[] args) {
		ThreadSync t1=new ThreadSync() {
			public void run() {
			try {
				ThreadSync.add(4);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
			}
		};
	ThreadSync t2=new ThreadSync() {
		public void run() {
			try {
				ThreadSync.add(8);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				}}
		
	};
	
	t1.start();
    t2.start();
}
}
