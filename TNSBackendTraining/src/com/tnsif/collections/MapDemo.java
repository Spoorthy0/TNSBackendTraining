//Collections:Map
package com.tnsif.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//using HashMap
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Spoorthy",98);
		mp.put("Aishu",87);
		mp.put("Mithra",87);
		mp.put("Spoorthy",65);
		System.out.println("The keys are :"+mp.keySet());
		for(String name:mp.keySet()) {
			System.out.println(name +" : "+mp.get(name));
		}
		
		//using LinkedHashMap
		
		Map<String,Integer> mp1=new LinkedHashMap<>();
		mp1.put("Cse",98);
		mp1.put("Cs",87);
		mp1.put("DS",87);
		mp1.put("Cse",65);
		System.out.println("The keys are :"+mp1.keySet());
		for(Map.Entry<String, Integer> entry:mp1.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}

	}

}
