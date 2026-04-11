package com.java8;

import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3  ;
		
		long factorial = IntStream.rangeClosed(1, num)
				.reduce((a,b)->a*b)
				.orElse(1);
		
		System.out.println("factorial : "+factorial);

	}

}
