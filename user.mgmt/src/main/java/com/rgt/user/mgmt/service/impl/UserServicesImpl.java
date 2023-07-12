package com.rgt.user.mgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgt.user.mgmt.entity.User;
import com.rgt.user.mgmt.repository.UserRepository;
import com.rgt.user.mgmt.service.UserServices;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User createUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser;
	}

	@Override
	public User updateUser(Integer id, User user) {
		User updatedUser = userRepo.updateUser(id,user);
		return updatedUser;
	}

	@Override
	public User getUser(Integer id) {
		User userById = userRepo.getUserById(id);
		return userById;
	}

	@Override
	public void deleteUser(Integer id) {
		userRepo.DeleteUser(id);
		return;
	}

}
