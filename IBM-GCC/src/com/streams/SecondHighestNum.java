package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,6,7,3,6,9};
		
		int largest = arr[0];
		int secLargest = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest = largest;
				largest=arr[i];
				
			}
		}
		
		System.out.println("largest: "+largest);
		System.out.println("Sceond largest : "+secLargest);

		//using streams
		List<Integer> list = List.of(3,6,7,3,6,9);
		Optional<Integer> secondLarest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Sceond largest using streams : "+secondLarest);
		
	}

}
