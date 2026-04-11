package com.dsa.search;

import java.util.stream.IntStream;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20,35,-15,7,55,1,-22};
		int val = linearSearch(array, -15);
		System.out.println("value : "+val);
		
		
		//java 8
		System.out.println("java 8 result : "+streamLinearSearch(array, -22));
				}

	public static int linearSearch(int[] array, int result) {
		for(int i=0; i<array.length;i++) {
			if(array[i] == result) {
				return i;
			}
		}
		return 0;
	}
	
	public static int streamLinearSearch(int[] a, int target) {
		int result = IntStream.range(0, a.length)
				.filter(i->a[i]==target)
				.findFirst()
				.orElse(-1);
		return result;
	}
}
