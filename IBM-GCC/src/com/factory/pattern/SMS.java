package com.factory.pattern;

public class SMS implements NotificationService{

	@Override
	public void send(String message) {
		System.out.println("send sms");
		
	}

}
