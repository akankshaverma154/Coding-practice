package com.dsa.patterns;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {

		String str = "Hello World";
		
		Map<Character, Integer> charCnt = new HashMap<>();
		
		char[] ch = str.toLowerCase().toCharArray();
		System.out.println(ch.length);
		
		for(int i =0; i< ch.length;i++) {
			System.out.println(ch[i]);
			if(ch[i] != ' ') {
				charCnt.put(ch[i], charCnt.getOrDefault(ch[i],0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry :  charCnt.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
	}

}
