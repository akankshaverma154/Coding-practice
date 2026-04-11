package com.string.examnple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentence {

	public static void main(String[] args) {
		String sentence = "hello world java";
		
		String[] words = sentence.split("\\s");
		for(String s : words) {
			System.out.println(s);
		}

		List<String> wordsList = Arrays.asList(words);
		Collections.reverse(wordsList);
		String reversed = String.join(" ",wordsList);
		System.out.println(reversed);
		
		
		//using java 8
		List<String> list = Arrays.asList(sentence.split("\\s"));
		
		Collections.reverse(list);
		
		String rev = list.stream().collect(Collectors.joining(" "));
		System.out.println(rev);
		
		
		
		
	}

}
