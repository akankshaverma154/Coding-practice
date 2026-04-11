package com.integer;

import java.util.PriorityQueue;

public class KthHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,10,4,3,20,15};
		int k =3;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n;
		for(int i =0; i<arr.length;i++) {
			pq.offer(arr[i]);
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		n = pq.peek();
		System.out.println("3rd largest element is : "+n);
		
	}

}
