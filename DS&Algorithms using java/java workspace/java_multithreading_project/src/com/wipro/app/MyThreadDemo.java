package com.wipro.app;
import com.wipro.service.MyThread;
public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread thread1 = new Thread("worker-1");
		thread1.start();//implicitly invokes run() method
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of main thread");
	}
}
