/**
 * 
 */
package com.main.data.structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.main.services.DataStructureService;

/**
 * @author Bharat
 *
 */
public class HashSetDS implements DataStructureService {

	@Override
	public List<List<Long>> calculateTimeAndSpace(long time) {
		long initial_free_space = Runtime.getRuntime().freeMemory();
		long nano_startTime = System.nanoTime();
		Set<Integer> hashSet = new HashSet<>();
		for(int i=0;i<time;i++) {
			hashSet.add(i);
		}
		long final_free_space = Runtime.getRuntime().freeMemory();
		long nano_endTime = System.nanoTime();
		
		List<List<Long>> result = new ArrayList<>();
		List<Long> times = new ArrayList<>();
		List<Long> spaces = new ArrayList<>();
		
		times.add(nano_startTime);
		times.add(nano_endTime);
		spaces.add(final_free_space);
		spaces.add(initial_free_space);
		result.add(times);
		result.add(spaces);
		return result;
	}

	@Override
	public List<List<Long>> calculateTimeAndSpaceForDelettion(long time) {
		// TODO Auto-generated method stub
		return null;
	}

}
