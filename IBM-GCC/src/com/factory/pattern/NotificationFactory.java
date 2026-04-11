package com.factory.pattern;

public class NotificationFactory {
	
	public static NotificationService sendNotification(String type) {
		if(type==null) {
			return null;
		}
		else if(null!=type && type.equalsIgnoreCase("sms")) {
			return new SMS();
		}else if(null!=type && type.equalsIgnoreCase("email")) {
			return new Email();
		}else if(null!=type && type.equalsIgnoreCase("push")) {
			return new Push();
		}
		
		return null;
	}

}
