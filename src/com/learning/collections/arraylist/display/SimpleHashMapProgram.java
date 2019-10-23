package com.learning.collections.arraylist.display;

import java.util.*;

public class SimpleHashMapProgram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> ha=new HashMap<Integer,String>();
		
ha.put(1, "value1");
ha.put(2," value2");
ha.put(3, "value3");
ha.put(4, "value4");
ha.put(5, "value5");
ha.put(6, "value6");
System.out.println("While Loop:");
Iterator iterator = ha.entrySet().iterator();
while (iterator.hasNext()) {
     Map.Entry me2 = (Map.Entry) iterator.next();
  System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
	}

}
}
