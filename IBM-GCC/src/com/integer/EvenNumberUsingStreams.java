package com.integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
		
		List<Integer> evenNum = list.stream().filter(n->n%2==00).collect(Collectors.toList());
		System.out.println(evenNum);
		
	}

}
