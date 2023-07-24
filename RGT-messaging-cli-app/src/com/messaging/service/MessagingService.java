package com.messaging.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.messaging.LoginResponse;
import com.messaging.Tweet;
import com.messaging.User;

public class MessagingService {
	private Map<String, User> users = new HashMap<>();
	private List<Tweet> tweets = new ArrayList<>();
	
	public boolean registerUser(User user) {
		String userName = user.getUserName();
		if(!users.containsKey(userName)) {
			users.put(userName, user);
			return true;
		}
		else return false;
	}
	
	public LoginResponse login(String[] loginDetail) {
		String userName = loginDetail[0];
		String password = loginDetail[1];
		LoginResponse loginResponse = new LoginResponse();
		
		if(users.containsKey(userName)) {
			User user = users.get(userName);
			if(user.getPassword().equals(password)) {
				loginResponse.setUser(user);
				loginResponse.setLogin(true);
			}
			else loginResponse.setLogin(false);
		}
		else {
			loginResponse.setLogin(false);
		}
		return loginResponse;
	}
	
	public void saveTweet(Tweet tweet, String userName) {
		User user = users.get(userName);
		user.setTweet(tweet);
		tweets.add(tweet);
	}
	
	public List<String> getUserNames(){
		List<String> userNames = new ArrayList<String>(users.keySet());
		return userNames;
	}
	
	public User searchUser(String userName) {
		if(users.containsKey(userName)) {
			return users.get(userName);
		}
		else return null;
	}
}
