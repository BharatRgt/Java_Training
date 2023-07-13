package com.rgt.user.mgmt.service;

import java.io.File;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class UserHelper {
	
	private int id=0;
	
	//return unique id;
	public int uniqueId()
	{
		 File[] listOfFiles = listOfFiles();
		 int length = listOfFiles.length;
		 String lastFileName = listOfFiles[length-1].getName();
		 int end_idx = lastFileName.indexOf('.');
		 int idx = Integer.parseInt(lastFileName.substring(4, end_idx));
		 System.out.println("index is : "+idx);
		 this.id = idx;
		 return ++id;
	}
	
	public File[] listOfFiles()
	{
		String path = "C:\\rgt\\Java_Training_projects\\Java_Training\\user.mgmt\\data\\users";
		File fObj = new File(path);
		File[] listOfFiles = null;
		if(fObj.exists() && fObj.isDirectory())
		{
			listOfFiles = fObj.listFiles();
		}
		return listOfFiles;
	}
}
