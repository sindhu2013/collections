package com.learning.collections.arraylist.display;
import java.util.Set;
import java.util.TreeSet;
	import java.util.HashSet;
	public class HashSetExample {
	   public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	      hset.clear();
	      System.out.println(hset);
	      HashSet<String> hset2 = new HashSet<String>();
	      hset2.add("Item1");
	      hset2.add("Item2");
	  
	      // Copying one Set to another
	      hset.addAll(hset2);
	  
	      System.out.println("Set after addAll:"+ hset);
	      for (String temp : hset) {
	          System.out.println(temp);
	       }
	   // Creating a TreeSet of HashSet elements
	      Set<String> tset = new TreeSet<String>(hset);
	  
	      // Displaying TreeSet elements
	      System.out.println("TreeSet contains: ");
	      for(String temp : tset){
	         System.out.println(temp);
	      }
	      
	    }
	

}
