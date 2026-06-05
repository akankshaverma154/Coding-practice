package com.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		CompletableFuture<String> greetingFuture = 
				CompletableFuture.supplyAsync(()->{
					return "Hello from CompletableFuture";
				});
		
		System.out.println(greetingFuture.get());

		
		
		
	}

}
