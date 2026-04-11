package com.streams;

import java.util.Comparator;
import java.util.List;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<String> word = List.of("java", "spring", "Kubernetes", "Microservices",
				"Docker", "API");
		
		String longest = word.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse("");
		
		System.out.println("longest string : "+longest);
	}

}
