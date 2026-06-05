package com.dsa.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("aks", "verma", 1));
		list.add(new Employee("abc", "verma", 2));
		list.add(new Employee("def", "verma", 3));
		list.add(new Employee("ghj", "verma", 4));
		
		list.sort(new Employee.SortById());
		
		list.forEach(e->System.out.println("employee : "+e));
		System.out.println("2nd employee :"+list.get(1));
		
		System.out.println(list.isEmpty());
		
		//replace an item in the list
		list.set(1, new Employee("vihaan", "agrawal", 9999));
		System.out.println("updated employee list : "+list);
		
		//convert list to array
		Employee[] empArray = list.toArray(new Employee[list.size()]);
		for(Employee e : empArray) {
			System.out.println("array : "+e);
		}
		
		//contains
		System.out.println(list.contains(new Employee("vihaan","agrawal",9999)));
		System.out.println(list.indexOf(new Employee("vihaan","agrawal",9999)));
		
		list.remove(0);
		
		
		list.forEach(e->System.out.println("employee : "+e));
		
		
	}

}
