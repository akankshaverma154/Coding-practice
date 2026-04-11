package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {

		///fine unique and duplicate element
		List<Integer> list = Arrays.asList(1,2,3,4,2,5,3);
		
		Set<Integer> duplicate = list.stream().filter(n->Collections.frequency(list, n)>1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicate);
		
		Set<Integer> unique = list.stream().filter(n->Collections.frequency(list, n)==1)
				.collect(Collectors.toSet());

		System.out.println(unique);
		
		//convert strings to uppercase
		List<String> names = Arrays.asList("java","spring","kafka");
		List<String> r = names.stream()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
		System.out.println(r);
		
		//find max number in list
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		int max = numbers.stream()
				.max(Integer::compare)
				.get();
		System.out.println("max : "+max);
		
		//occurence of each character
		String str = "programming";
		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		System.out.println("map: "+map);
		
		//second highest number
		List<Integer> list1 = Arrays.asList(10,20,30,40);
		Integer num1 = list1.stream()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst()
					.get();
		System.out.println("second highest : "+num1);
		
			
	
	}

}
