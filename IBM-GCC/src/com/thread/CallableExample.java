package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Callable<Integer> c = ()->{
			int sum = 0;
			for(int i =0;i<5;i++) {
				sum+=i;
			}
			return sum;
		};

		Future<Integer> future = service.submit(c);
		System.out.println("Result : "+future.get());
		
		service.shutdown();
	}

}
