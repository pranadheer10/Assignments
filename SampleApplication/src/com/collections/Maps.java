package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

	private Map<Integer, Users> map= new HashMap<Integer, Users>();
	public Map<Integer, Users> populate(Iterating_Collections ic){
		map.put(1, ic.u);
		map.put(2, ic.u1);
		map.put(3, ic.u2);
		map.put(4, ic.u3);
		
		
		Iterator it= map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair= (Map.Entry)it.next();
			System.out.println(pair.getKey()+" "+pair.getValue());
		}
		
		
		map.forEach((k,v)->System.out.println("Id : " + k + " Users : " + v));
		
		return map;
	}
	
}
