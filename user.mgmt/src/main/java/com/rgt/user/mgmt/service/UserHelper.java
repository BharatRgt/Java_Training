package com.rgt.user.mgmt.service;

import org.springframework.stereotype.Service;

@Service
public class UserHelper {
	
	private int id=100;
	
	public int uniqueId()
	{
		return id++;
	}
}
