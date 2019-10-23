package com.learning.collections.arraylist.display;


	import java.util.HashMap;
	public class copyonehashmaptoother { 
	  public static void main(String[] args) {
	     // Create a HashMap
	     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	 
	     //add elements to HashMap
	     hmap.put(1, "AA");
	     hmap.put(2, "BB");
	     hmap.put(3, "CC");
	     hmap.put(4, "DD");
	     boolean flag = hmap.containsKey(2);
	     System.out.println("Key 2 exists in HashMap? : " + flag);
	     boolean flag1= hmap.containsKey(5);
	     System.out.println("Key 5 exists in HashMap? : " + flag1);
	     boolean flag3 = hmap.containsValue("AA");
	     System.out.println("Key 2 exists in HashMap? : " + flag3);
	  
	     String val=hmap.get(4);
	     System.out.println("The Value mapped to Key 4 is:"+ val);
	     // Create another HashMap
	     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
	 
	     // Adding elements to the recently created HashMap
	     hmap2.put(11, "Hello");
	     hmap2.put(22, "Hi");
	 
	     // Copying one HashMap "hmap" to another HashMap "hmap2"
	     hmap2.putAll(hmap);
	     HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();
		 hmap3.put(null, null);
		 hmap3.compute(2, null);
	     hmap3.putAll(hmap2);
	 
	     // Displaying HashMap "hmap2" content
	     System.out.println("HashMap 2 contains: "+ hmap2);
	     System.out.println("HashMap 3 contains: "+ hmap3);
	     HashMap<Integer, String> hmap4 = new HashMap<Integer, String>();
	     hmap4=(HashMap)hmap3.clone();
	     System.out.println("HashMap 4 contains: "+ hmap4);
	  }
	
}
