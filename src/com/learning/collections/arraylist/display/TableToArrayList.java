package com.learning.collections.arraylist.display;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	public class TableToArrayList {
	   public static void main(String args[]) throws Exception {
	      //Registering the Driver
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/mydatabase";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
	      System.out.println("Connection established......");
	      //Creating a Statement object
	      Statement stmt = con.createStatement();
	      //Retrieving the data
	      ResultSet rs = stmt.executeQuery("select * from MyPlayers");
	      //Creating an ArrayList object
	      ArrayList<Player> arrayList = new ArrayList<>();
	      //Adding the Records of the table to the Array List
	      while(rs.next()) {
	         Player player = new Player();
	         player.setID(rs.getInt("ID"));
	         player.setFirst_Name(rs.getString("First_Name"));
	         player.setLast_Name(rs.getString("Last_Name"));
	         player.setDate_Of_Birth(rs.getDate("Date_Of_Birth"));
	         player.setPlace_Of_Birth(rs.getString("Place_Of_Birth"));
	         player.setCountry(rs.getString("Country"));
	         arrayList.add(player);
	      }
	      for (Player obj : arrayList) {
	         System.out.print("ID: "+obj.getID()+", ");
	         System.out.print("Name: "+obj.getFirst_Name()+", ");
	         System.out.print("Age: "+obj.getLast_Name()+", ");
	         System.out.print("Salary: "+obj.getDate_Of_Birth()+", ");
	         System.out.print("Country: "+obj.getPlace_Of_Birth()+", ");
	         System.out.print("Address: "+obj.getCountry());
	         System.out.println();
	      }
	   }
	}


