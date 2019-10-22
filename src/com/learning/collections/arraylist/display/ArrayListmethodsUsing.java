
package com.learning.collections.arraylist.display;
import java.util.*;
public class ArrayListmethodsUsing {
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add(null);
		a1.add("sindhu1");
		a1.add(null);
		a1.add("sindhu2");
		a1.add("sindhu3");
		a1.add("sindhu4");
		a1.add("sindhu5");
	System.out.println("original data");
	for(String element:a1)
	{
		System.out.println(element);
	}
	a1.ensureCapacity(5);
	a1.add(null);
	
	ArrayList<String> a2=new ArrayList<String>();	
		
	a2.addAll(a1)	;
	for(String element1:a1)
	{
		System.out.println(element1);
	}
	//ArrayList<String> a2=new ArrayList<String>();	
	System.out.println("First element of the ArrayList: "+a1.get(0));
	
	System.out.println("third element of the ArrayList: "+a1.get(3));	
	System.out.println("First element of the ArrayList: "+a1.get(4));
	
	ArrayList<Integer> obj = new ArrayList<Integer>(Collections.nCopies(10, 5));
	System.out.println(obj);
	
	
	
	}
	
	

}
