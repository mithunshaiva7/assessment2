package com.dev.gmail;
import java.util.Scanner;


public class JavaMain {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		Users u1=new Users();
		UserInterfaceImp u01=new UserInterfaceImp();
		
		MsgInterfaceImpl m11=new MsgInterfaceImpl();
		Message m1=new Message();
	
		System.out.println("Press 1 to login");
		System.out.println("Press 2 to register");
		int value=s.nextInt();
		
		if(value==1) {
			System.out.println("enter email:");
			String emailInput=s.next();
			
		
		System.out.println("enter password:");
		String passwordInput=s.next();
		

	
	System.out.println("=========You Have Successfully Logged in============");
	System.out.println("Press A to compose");
System.out.println("Press B to show inbox");
char optionAB=s.next().charAt(0);
if(optionAB=='A') {
	int userId=0;
	int msgId=2+userId;	
	System.out.println("Enter emailid of destination:");
	String destEmail=s.next();
	System.out.println("Enter message");
	String destMsg=s.next();
	m1.setMessage(destMsg);
	m1.setMessageid(msgId);
	m1.setUserid(userId);
	
	m11.storeMessage(destEmail, m1);
	System.out.println("message scuccessfully stored");
	userId=userId+1;
}

System.out.println("press B to display mails");
optionAB=s.next().charAt(0);
if(optionAB=='B') {
	
	m11.display(emailInput);
	
}
		}
		
	
else if(value==2) {
	int count=0;
	System.out.println("Enter the username:");
	String name=s.next();
	
	System.out.println("enter the password:");
	String password=s.next();
	System.out.println("Enter the email:");
String email=s.next();
u1.setEmail(email);
u1.setPassword(password);
u1.setUsername(name);
u1.setUserid(count);
count++;
boolean b=u01.registerAdd(u1);
System.out.println("registered successfully");

System.out.println("Users Hashset contains:");
u01.getUsersData();
}else {
	System.out.println("Enter valid option");
}



		}
		
	}

