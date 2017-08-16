package com.simpleprogrammer.proteintracker;

import com.techventus.server.voice.Voice;

public class SMSNotifier implements Notifier {

	private String userName;
	private String password;
	private String numberToMessage;

	public SMSNotifier(String userName, String password, String numberToMessage) {

		this.userName = userName;
		this.password = password;
		this.numberToMessage = numberToMessage;
	}

	public boolean send(String message) {
		try {
			Voice voice = new Voice(userName, password);
			voice.sendSMS(numberToMessage, message);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
