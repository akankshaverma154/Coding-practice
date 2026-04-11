package com.dsa.arrays;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = fact(3);
		System.out.println(result);
		
		int r = recursiveFact(3);
		
		System.out.println("recursive : "+r);
		
	}
	
	public static int fact(int num) {
		
		if(num==0) {
			return 1;
		}
		
		
		int factorial = 1;
		
		for(int i = 1; i<=num;i++) {
			factorial = factorial*i;
		}
	return factorial;
	}

	public static int recursiveFact(int n) {
		if(n==0) {
			return 1;
		}
		return n *fact(n-1);
	}
	
}
