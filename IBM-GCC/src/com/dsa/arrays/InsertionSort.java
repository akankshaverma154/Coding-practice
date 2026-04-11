package com.dsa.arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array = {20,35,-15,7,55,1,-22};
		
		int index = 0;
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex<array.length; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];
			
			int i;
			for(i=firstUnsortedIndex;i>0 && array[i-1]>newElement;i--) {
				array[i] = array[i-1];
			}
			array[i] = newElement;
		}
		
		for(int a : array) {
			System.out.println("sorted array : "+a);
		}
		
	}

}
