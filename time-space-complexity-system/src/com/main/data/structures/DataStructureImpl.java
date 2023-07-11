package com.main.data.structures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.main.services.DataStructureService;

public class DataStructureImpl implements DataStructureService{

	private ArrayList<Integer> arrlist = null;
	private LinkedList<Integer> linList = null;
	private Set<Integer> set = null;
	private Map<Integer, Integer> map = null;
	
	public DataStructureImpl(ArrayList<Integer> arrList)
	{
		arrlist = arrList;
	}
	public DataStructureImpl(LinkedList<Integer> linkedList)
	{
		linList = linkedList;
	}
	public DataStructureImpl(HashSet<Integer> hashSet)
	{
		set = hashSet;
	}
	public DataStructureImpl(TreeSet<Integer> treeSet)
	{
		set = treeSet;
	}
	public DataStructureImpl(HashMap<Integer, Integer> hashMap)
	{
		map = hashMap;
	}
	public DataStructureImpl(TreeMap<Integer, Integer> treeMap)
	{
		map = treeMap;
	}
	
	
	@Override
	public List<List<Long>> calculateTimeAndSpace(long time) {
		long initial_free_space = Runtime.getRuntime().freeMemory();
		long nano_startTime = System.nanoTime();
		if(map != null)
		{
			//System.out.println("map is not null");
			for(int i=0;i<time;i++) {
				map.put(i,1);
			}
		}
		else if(set!=null) {	
			//System.out.println("set is not null");
			for(int i=0;i<time;i++) {
				set.add(i);
			}
		}
		else if(arrlist!=null){
			//System.out.println("list is not null");
			for(int i=0;i<time;i++)
			{
				arrlist.add(i);
			}
		}
		else {
			for(int i=0;i<time;i++)
			{
				linList.add(i);
			}
			System.out.println("inked list is : "+linList);
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
		long initial_free_space = Runtime.getRuntime().freeMemory();
		long nano_startTime = System.nanoTime();
		if(map != null)
		{
			//System.out.println("map is not null");
			for(int i=0;i<time;i++) {
				map.remove(i);
			}
		}
		else if(set!=null) {	
			//System.out.println("set is not null");
			for(int i=0;i<time;i++) {
				set.remove(i);
			}
		}
		else if(arrlist != null){
			for(int i=0;i<time;i++)
			{
				arrlist.remove(0);
			}
		}
		else {
			for(int i=0;i<time;i++)
			{
//				System.out.println(linList.get(i));
				linList.remove();
			}
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

	
	
	public Set<Integer> getSet() {
		return set;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	public Map<Integer, Integer> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Integer> map) {
		this.map = map;
	}
	
}
