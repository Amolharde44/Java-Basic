package com.DSA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	 String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=<dbName>";
	 String DB_USER = "Anemoi";
	   String DB_PASSWORD = "Anemoi@123";
	   
	   Connection conn=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	   
	   
	   String query = "SELECT * FROM your_table";
       PreparedStatement statement = conn.prepareStatement(query);
       ResultSet resultSet = statement.executeQuery();

       while (resultSet.next()) {
           // Process each row of the result set
           int id = resultSet.getInt("id");
           String name = resultSet.getString("name");
           // ... process other columns
           System.out.println("ID: " + id + ", Name: " + name);
       }

       resultSet.close();
       statement.close();
       conn.close();
	   
	   

	}

}
