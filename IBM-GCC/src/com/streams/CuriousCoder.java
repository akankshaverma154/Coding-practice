package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CuriousCoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove duplicates and sort in ascending order
		List<Integer> list = Arrays.asList(5,3,1,3,2,5,4);
		List<Integer> sortedList = list.stream()
				.distinct().sorted().toList();
		System.out.println("sorted list with disctinct elements : "+sortedList);
		
		List<Integer> sortedListDesc = list.stream()
				.distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println("sorted list with disctinct elements descorder: "+sortedListDesc);
		
		//find odd and return squares
		List<Integer> oddSquareList = list.stream()
				.filter(x->x%2!=0)
				.map(e->e*e)
				.toList();
		System.out.println("oddSquareList : "+oddSquareList);
		
		

	}

}
