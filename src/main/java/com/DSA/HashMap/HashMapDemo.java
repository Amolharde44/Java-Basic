package com.DSA.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int intial=100;
		
		Map<Integer, String> map=new LinkedHashMap<Integer,String>(intial);

		System.out.println(map);
		
		map.put(intial, "Amol");
		
		System.out.println("After add key and value:"+map);
		
		
		// Initialize a HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        
        System.err.println(hashMap);

        // Access values using keys
        int aliceAge = hashMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);
	}

}
