package com.dsa.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20,35,-15,7,55,1,-22};
		Arrays.sort(array);
		
	
		int mid = array.length / 2;
		System.out.println(mid);
		int target = 55;
		int start =0;
		int end =array.length;
		if(target<array[mid]) {
			end = mid;
		}else {
			start = mid;
		}

		for(int i=start;i<mid;i++) {
			if(target==array[i]) {
				System.out.println("i : "+i);
			}
		}
		
	}

}
