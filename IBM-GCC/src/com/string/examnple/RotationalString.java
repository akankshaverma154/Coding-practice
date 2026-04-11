package com.string.examnple;

public class RotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "apple";
		
		String str2 = "pleap";
		
		String str3 = str1+str2;
		
		System.out.println("str3 : "+str3);
		
		if(str3.contains(str2)) {
			System.out.println("string is rotational");
		}
		
	}

}
