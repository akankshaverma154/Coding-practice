package com.integer;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//int n = []
		
		for(int i=100; i<200;i++){
			isPrime(i);
			if(isPrime(i) && i%10==7 ) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i =2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
