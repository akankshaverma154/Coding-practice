package com.integer;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sortedArrayWithDuplicates
		 int[] num = {2,3,4,1,5,6,7,6,5,4,5,6,7,8,6,5,6};
		 
		Arrays.sort(num);
		 int cnt =0;
		 for(int i=1;i<num.length;i++) {
			 if(num[cnt] != num[i]) {
				 cnt++;
				 num[cnt]=num[i];
			 }
		 }
		 int newLenght = cnt+1;
		 for(int j =0; j<newLenght;j++) {
			 System.out.println(num[j]);
			 //System.out.println("no.of elements: "+cnt+1);
		 }
		 
		
	}

}
