package com.integer;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		int n = arr.length;
		
		reverse(arr,0,n-1);
		System.out.println("reverse  = "+Arrays.toString(arr));
		
		reverse(arr,0,k-1);
		System.out.println("reverse upto k = "+Arrays.toString(arr));
		
		reverse(arr,k,n-1);
		
		System.out.println("reverse output = "+Arrays.toString(arr));
		
		
	}
	
	public static void reverse(int[] a, int start, int end) {
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

}
