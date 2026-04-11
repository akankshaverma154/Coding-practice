package com.random;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> map = new HashMap<>();
		
		String s = "abcabcd";
		
		char[] c = s.toCharArray();
		
		map.put('a', 0);
		map.put('b', 1);
		map.put('c', 2);
		
		System.out.println("value of a : "+map.get('a'));
		System.out.println("value of b : "+map.get('b'));
		System.out.println("value of c : "+map.get('c'));
		
		map.put('a', 3);
		map.put('b', 4);
		map.put('c', 5);
		
		System.out.println("value of a1 : "+map.get('a'));
		System.out.println("value of b1 : "+map.get('b'));
		System.out.println("value of c1 : "+map.get('c'));
	}

}
