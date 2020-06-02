package com.sushant.coding.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> unsortedMap = new HashMap<>();
		unsortedMap.put("apple", "apple");
		unsortedMap.put("pineapple", "pineapple");
		unsortedMap.put("banana", "banana");
		unsortedMap.put("guava", "guava");
		
		for(Map.Entry<String, String> entry:unsortedMap.entrySet()) {
			System.out.println("Unsorted Key value="+entry.getKey());
		}
		
		Map<String,String> treeMap=new TreeMap<>(unsortedMap);
		for(Map.Entry<String, String> entry:treeMap.entrySet()) {
			System.out.println(" Sorted Key value="+entry.getKey());
		}
	}
	

}
