package com.dev.gmail;
import java.util.HashMap;

public class MsgInterfaceImpl implements MessageInterface {
		
		HashMap<String , Message> hm=new HashMap<String,Message> ();
		
		@Override
	public boolean storeMessage(String emailId, Message message) {
		
			hm.put("1",message);
		return true;
	}

		@Override
		public boolean display(String emailId) {
			System.out.print("Inbox of "+emailId+" contains");
			System.out.println(hm);		
			return true;
		}

}
