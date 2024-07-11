package com.wipro.app;
import com.wipro.service.SharedObject;
public class SyncDemo {
	public static void main(String[] args) {
		Runnable runnable = new SharedObject();
		Thread thread1 = new Thread(runnable,"worker-1");
		Thread thread2 = new Thread(runnable,"worker-2");
		
		thread1.start();
		thread2.start();
	}
}
