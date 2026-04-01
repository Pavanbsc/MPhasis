package com.mphasis.jdbcdemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCMain {
 public static void main(String[] args) {
	 System.out.println("");
	 
	 System.out.println("------------------");
	System.out.println("💕Welcome to JDBC💕");
	System.out.println("------------------");
	
	//driver load
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
	
	//createing connction
	
	

	
	try {
		
		String password="root@39";
		String user="root";
		String url = "jdbc:mysql://localhost:3306/mydb";
		Connection con = DriverManager.getConnection(url,user,password);
		String query="select * from product";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		System.out.println(" ");
		System.out.println("---Product Table---");
		System.out.println(" ");
		while (rs.next()) {
			
			System.out.println(rs.getString("id")+" : "+rs.getString("name")+" , "+ rs.getInt("price"));
			}
		rs.close();
		stmt.close();
		con.close();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
}
}
