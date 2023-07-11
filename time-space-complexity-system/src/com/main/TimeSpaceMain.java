package com.main;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import com.main.data.structures.ArrayListDS;
import com.main.data.structures.DataStructureImpl;
import com.main.data.structures.HashMapDS;
import com.main.data.structures.HashSetDS;
import com.main.data.structures.LinkedLListDS;
import com.main.data.structures.TreeMapDS;
import com.main.data.structures.TreeSetDS;
import com.main.services.DataStructureService;

public class TimeSpaceMain {
	//private static final int INPUT1=10000;
	private static final int INPUT2=1000000;
	
	private static List<List<Long>> calculatedTimeAndSpace;
	
	public static void main(String[] args) {
		
		HelperServices services = new HelperServices();
		
		
		ArrayList<Integer> arrList = new ArrayList<>();
		DataStructureImpl arrayList = new DataStructureImpl(arrList);
		calculatedTimeAndSpace =arrayList.calculateTimeAndSpace(10);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2, "Array List");
		calculatedTimeAndSpace = arrayList.calculateTimeAndSpaceForDelettion(10);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "Array List");
		
		services.printSeprator();
		
		LinkedList<Integer> linList = new LinkedList<>();
		DataStructureImpl linkedList = new DataStructureImpl(linList);
		calculatedTimeAndSpace = linkedList.calculateTimeAndSpace(10);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2,"Linked List");
		calculatedTimeAndSpace =linkedList.calculateTimeAndSpaceForDelettion(10);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "Linked List");
		
		services.printSeprator();
		HashSet<Integer> hSet = new HashSet<>();
		DataStructureImpl hashSet = new DataStructureImpl(hSet);
		calculatedTimeAndSpace = hashSet.calculateTimeAndSpace(INPUT2);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2, "Hash Set");
		calculatedTimeAndSpace = hashSet.calculateTimeAndSpaceForDelettion(INPUT2);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "Hash Set");
		
		
		services.printSeprator();
		TreeSet<Integer> tSet = new TreeSet<>();
		DataStructureImpl treeSet = new DataStructureImpl(tSet);
		calculatedTimeAndSpace = treeSet.calculateTimeAndSpace(INPUT2);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2, "Tree Set");
		calculatedTimeAndSpace =treeSet.calculateTimeAndSpaceForDelettion(INPUT2);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "tree set");
		
		services.printSeprator();
		HashMap<Integer, Integer> hMap = new HashMap<>();
		DataStructureImpl hashMap = new DataStructureImpl(hMap);
		calculatedTimeAndSpace = hashMap.calculateTimeAndSpace(INPUT2);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2, "Hash Set");
		calculatedTimeAndSpace = hashMap.calculateTimeAndSpaceForDelettion(INPUT2);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "hash Map");
		
		services.printSeprator();
		TreeMap<Integer, Integer> tMap = new TreeMap<>();
		DataStructureImpl treeMap = new DataStructureImpl(tMap);
		calculatedTimeAndSpace = treeMap.calculateTimeAndSpace(INPUT2);
		services.printTimeAndSpace(calculatedTimeAndSpace, INPUT2, "Tree Map");
		calculatedTimeAndSpace = treeMap.calculateTimeAndSpaceForDelettion(INPUT2);
		services.printTimeAndSpaceForDeletion(calculatedTimeAndSpace, INPUT2, "Tree Map");
		
	}

}
