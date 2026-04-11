package com.string.examnple;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcccc";
		
		//output = a3b2c4
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = str.toCharArray();

		for(int i =0; i<ch.length;i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		StringBuilder s = new StringBuilder();
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			s.append(m.getKey()).append(m.getValue());
		}
		System.out.println("s : "+s);		
	}

}
