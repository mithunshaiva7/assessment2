package com.dev.gmail;
import java.util.HashMap;

public class UserInterfaceImp implements UserInterface {

	HashMap<String,Users> hm2=new HashMap<String,Users> ();
	
	
	@Override
	public boolean registerAdd(Users u) {
		hm2.put("1",u);
		return true;
	}


	@Override
	public void getUsersData() {
		System.out.println(hm2);
		
	}

}
