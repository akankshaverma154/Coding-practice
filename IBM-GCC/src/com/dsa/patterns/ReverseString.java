package com.dsa.patterns;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "abcdef";
		
		char[] c = s.toCharArray();
		
		int left =0;
		int right = s.length()-1;
		
		while(left<right) {
			char tmp;
			
			tmp=c[left];
			c[left] = c[right];
			c[right] = tmp;
			
			left++;
			right--;
		}
		
		System.out.println(c);
		
		
		//using Java8
		String str = new StringBuilder("abcdef").reverse().toString();
		System.out.println("reverse string : "+str);
		
		
	}

}
