package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {
	
	Map<Integer, Order> orderDb = new HashMap<>();
	
	public boolean createOrder(Order order) {
		
		
		if(null != order) {
			Order orderId = orderDb.get(order.getId());
			if(orderId != null) {
				throw new Exception ("data already present in DB");
			}
			
			orderDb.put(order.getId(), order);
		}
		
	}

	public List<Order> getAllOrders(){
		List<Order> orderList = new ArrayList<Order>();
		Collection<Order> allOrders = orderDb.values();
		allOrders.forEach(m->{
			orderList.add(m);
		});
		
		//allOrders.stream().collect(Collec)
		
		return orderList;
	}
	
	
}
