package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question {

	public static void main(String[] args) {
		//get digit count
	    String input = "hello 1223 world 45666 and universe 7899";
		Map<Character, Long> map = input.chars()
                .filter(c -> Character.isDigit(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        map.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(System.out::println);
        
        
        
        

	}

}
