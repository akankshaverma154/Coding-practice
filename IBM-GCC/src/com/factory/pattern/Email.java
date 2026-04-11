package com.factory.pattern;

public class Email implements NotificationService{

	@Override
	public void send(String message) {
		System.out.println("send email");		
	}

}
