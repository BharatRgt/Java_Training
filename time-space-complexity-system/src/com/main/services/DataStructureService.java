package com.main.services;

import java.util.ArrayList;
import java.util.List;

public interface DataStructureService {
	
	public List<List<Long>> calculateTimeAndSpace(long time);
	public List<List<Long>> calculateTimeAndSpaceForDelettion(long time);
}
