package com.learning.collections.arraylist.display;


import java.util.ArrayList;

public class ArrayListAddDisplay {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>(); 
		
		alist.add("first element");
		alist.add("second element");
		alist.add("third element");
		alist.add("fourth element");
		alist.add("fifth element");
		
		for (String element : alist) {
			System.out.println(element);
		}
		
		for (int i=0 ; i<alist.size() ;i++ ) {
			String element = alist.get(i);
			System.out.println(element);
			
		}
	}
}
