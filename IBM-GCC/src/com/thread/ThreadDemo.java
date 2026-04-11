package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread1 t2 = new MyThread1();
		
		Thread t3 = new Thread(t2);
		t3.start();
		
		
	}

}
