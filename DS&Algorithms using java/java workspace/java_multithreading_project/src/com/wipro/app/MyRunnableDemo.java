package com.wipro.app;
import com.wipro.service.MyRunnable;
/**
* It common to have instance of implementation class pointed by its
* interface type.
* Similarly it is common to have instance of a sub-class pointed by its super class.
*
* The above procedure is required to achieve polymorphic behaviour.
*
*/
public class MyRunnableDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		// Create a Runnable object
		Runnable runnable = new MyRunnable();
		//Attach Runnable object to Thread object
//		Thread thread1 = new Thread(runnable);
		Thread thread1 = new Thread(runnable,"worker-1");
		
		thread1.start();//implicitly invokes run() method
		
		try {
			/*
			 * thread1 says to main thread to join me. i.e. main thread
			 * goes to non-runnable state until worker thread has completed its task
			 * and then will come back to runnable state
			 */
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread thread2 = new Thread(runnable, "worker-2");
		
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End of main() method");
	}
}
