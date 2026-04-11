package com.factory.pattern;

public class Push implements NotificationService{

	@Override
	public void send(String message) {
		System.out.println("send push notification");		
	}

}
