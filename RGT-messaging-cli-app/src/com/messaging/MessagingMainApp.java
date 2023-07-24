package com.messaging;

import java.util.List;

import com.messaging.service.MessagingHelper;
import com.messaging.service.MessagingService;

public class MessagingMainApp {
	
	private static MessagingHelper helper = new MessagingHelper();
	private static MessagingService service = new MessagingService();
	private static LoginResponse loginResponse;
	
	public static void main(String[] args) {
		
		int mainChoice;
		do {
			mainChoice = helper.mainMenu();
			
			switch (mainChoice) {
			//register
			case 1:
				User user = helper.signUpForm();
				boolean isUserSaved = service.registerUser(user);
				helper.signUpMessage(isUserSaved);
				break;
			
			//login
			case 2:
			    String[] loginDetails = helper.loginForm();
			    loginResponse = service.login(loginDetails);
			    helper.loginMessage(loginResponse);
			    
			    if(loginResponse.isLogin())
			    {
			    	int loginUserChoice;
				    do {
				    	loginUserChoice = helper.loginedMenu();
					    switch (loginUserChoice)
					    {
					    	//post a tweet
							case 1: 
								Tweet createdTweet = helper.createTweet(loginResponse.getUser());
								service.saveTweet(createdTweet,loginResponse.getUser().getUserName());
								break;
							
							//view your profile;
							case 5:
								helper.showProfile(loginResponse.getUser());
								break;
							
							//search for users;
							case 3:
								List<String> userNames = service.getUserNames();
								String searchUserName = helper.searchUser();
								User searchedUser = service.searchUser(searchUserName);
								if(searchedUser == null)
								{
									System.out.println("user not found with this userName");
								}
								else {
									System.out.println("user found");
									
								}
								break;
								
							//logout:
							case 6:
								System.out.println(loginResponse.getUser().getName() + " logout successfully!!");
								break;
							default:
								throw new IllegalArgumentException("Unexpected value: " + loginUserChoice);
						}
				    }
				    while(loginUserChoice != 6);
			    }
				break;
			
			//exit
			case 3:
				System.out.println("visit again!!");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + mainChoice);
			}
		}
		while(mainChoice != 3);
	}
}
