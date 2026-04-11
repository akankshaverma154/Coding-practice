package com.factory.pattern;

public class NotificationFactoryEx {

	public static void main(String[] args) {

		NotificationService service = NotificationFactory.sendNotification("sms");
		service.send("sms");
		
	}

}
