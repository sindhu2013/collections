package com.learning.collections.arraylist.display;
import java.util.*;
public class ArrayListAddOneElement {

	public static void main(String[] args) {
		
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("sindhu");
		alist.add(null);
		alist.add("siddarh");
		alist.add("siu");
		alist.add("vikyathnu");
		alist.add(2,"vijay");
		alist.add(4,"kalyan");
		System.out.println("original one  arraylist");
		for(String element1:alist)
			System.out.println(element1);
		alist.add(2,"vijay");
		alist.add(4,"kalyan");
		System.out.println("after add  arraylist");
		for(String element1:alist)
			System.out.println(element1);
		
		alist.remove("siddarh");
		alist.remove("vikyathnu");
		System.out.println("after remove arraylist");
		for(String element1:alist)
			System.out.println(element1);
		
		//alist.addAll("sindhu");
	}
}

