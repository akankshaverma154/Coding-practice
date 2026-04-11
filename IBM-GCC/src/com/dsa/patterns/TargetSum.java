package com.dsa.patterns;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,7,11,15};
		int target = 9;
		int start =0;
		int end = a.length-1;
		
		while(start<end) {
			int sum = a[start] + a[end];
			if(sum==target) {
				System.out.println("pair found : "+a[start]+" "+a[end]);
				System.out.println("indices : "+start +" "+end);
				return;
			}
			else if(sum > target) {
				end--;
			}else if(sum<target){
				start++;
			}
		}
		
	}

}
