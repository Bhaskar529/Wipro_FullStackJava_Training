package com.wipro.service;
public class MyThread extends Thread{
	
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name); // invoking 1-arg constructor of Thread class
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread());
		System.out.println("processing..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of worker thread");
	}
	
}
