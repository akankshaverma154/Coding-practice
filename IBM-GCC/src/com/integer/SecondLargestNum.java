package com.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr1= {10,2,9,4,5,9,6,6,8};
		Arrays.sort(arr1);
		int highest = Integer.MIN_VALUE;
		int secHighest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>highest) {
				secHighest = highest;
				highest = arr1[i];
			}
		}
		
		System.out.println("second highest : "+secHighest);

		int x = Arrays.stream(arr1).boxed().distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst().orElseThrow(()->new RuntimeException("not found"));
				
		System.out.println(x);
	}

}
