package com.java8.fi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = (num) -> {
			if(num%2==0) 
				return true;
			else return false;
		};
		System.out.println(p.test(22));

	
		Function<Integer, Integer> f = (num)->{
			return num*num;
		};
		System.out.println(f.apply(2));
		
		Consumer<String> c = (str)->{
			System.out.println("my name is "+str);
		};
		c.accept("akanksha");
	
		Supplier<Integer> s = ()->{return (int)Math.random();};
		System.out.println(s.get());
	}

	
}
