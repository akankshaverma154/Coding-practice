package com.string.examnple;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "programming";
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(int i =0; i<ch.length;i++) {
			map.put(ch[i], map.getOrDefault(ch[i],0)+1);
		}
		
		for(Map.Entry<Character, Integer> ch1 : map.entrySet()) {
			if(ch1.getValue()>1) {
				System.out.println("duplicate :"+ch1.getKey());
			}
			
		}
		
		for(Map.Entry<Character, Integer> ch2 : map.entrySet()) {
			if(ch2.getValue()==1) {
				System.out.println("unique : "+ch2.getKey());
				break;
			}
		}
	}

}
