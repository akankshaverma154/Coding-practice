package com.string.examnple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String word: input) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			
			String key = new String(chars);
			System.out.println("key : "+key);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
		
			map.get(key).add(word);
		}
		
		List<List<String>> result = new ArrayList<>(map.values());
		System.out.println(result);
	}

}
