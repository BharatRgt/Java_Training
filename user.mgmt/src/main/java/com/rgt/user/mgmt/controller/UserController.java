package com.rgt.user.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgt.user.mgmt.entity.User;
import com.rgt.user.mgmt.service.UserServices;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User createdUser = userService.createUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id)
	{
		User user = userService.getUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(
			@PathVariable Integer id,
			@RequestBody User user) {

		User readuser = userService.updateUser(id,user);
		return new ResponseEntity<User>(readuser, HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id)
	{
		userService.deleteUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
