package com.rgt.user.mgmt.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgt.user.mgmt.entity.User;
import com.rgt.user.mgmt.service.UserHelper;

@Service
public class UserRepository {
	
	@Autowired
	private UserHelper userHelper;
	
	public User readFile(String fileName) {
		User readUser=null;
		try {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		readUser = (User)ois.readObject();
		
		ois.close();
		fis.close();
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		catch(IOException ioexc) {
			ioexc.printStackTrace();
		}
		return readUser;
	}
	
	public void writeFile(String fileName, User user)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			fos.close();
			oos.close();
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}
		return;
	}
	public User save(User user)
	{
		User readUser=null;
		user.setId(userHelper.uniqueId());
		String fileName = "C:\\rgt\\Java_Training_projects\\Java_Training\\user.mgmt\\data\\users/user"+user.getId()+".txt";
		writeFile(fileName, user);
		readUser = readFile(fileName);
		return readUser;
	}	
	
	public User getUserById(Integer id)
	{
		String fileName = "C:\\rgt\\Java_Training_projects\\Java_Training\\user.mgmt\\data\\users/user"+id+".txt";
		User readUser = readFile(fileName);
		return readUser;
	}
	
	public User updateUser(Integer id, User user)
	{
		user.setId(id);
		String fileName = "C:\\rgt\\Java_Training_projects\\Java_Training\\user.mgmt\\data\\users/user"+id+".txt";
		writeFile(fileName, user);
		return readFile(fileName);
	}
	
	public void DeleteUser(Integer id)
	{
		String fileName = "C:\\rgt\\Java_Training_projects\\Java_Training\\user.mgmt\\data\\users/user"+id+".txt";
		File file = new File(fileName);
		file.delete();
	}
	
}
