package com.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("hungry", "coders");

		List<Character> charList = words.stream()
				.flatMap(word->word.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		
		System.out.println("charlist : "+charList);
		
	}

}
