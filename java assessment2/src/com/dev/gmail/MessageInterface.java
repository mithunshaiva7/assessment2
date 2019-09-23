package com.dev.gmail;

public interface MessageInterface {

	public boolean storeMessage(String emailId,	Message message);
	public boolean display(String emailId);
}
