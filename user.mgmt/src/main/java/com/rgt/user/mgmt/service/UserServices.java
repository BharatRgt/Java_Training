package com.rgt.user.mgmt.service;

import org.springframework.stereotype.Service;

import com.rgt.user.mgmt.entity.User;

@Service
public interface UserServices {
	public User createUser(User user);
	
	public User updateUser(Integer id,User user);
	
	public User getUser(Integer id);
	
	public void deleteUser(Integer id);
}
