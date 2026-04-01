package com.mphasis.productmanagerapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductDAO {
   public List<ProductModel> findAll(){
	   
	   List<ProductModel> products = new ArrayList<>();
	   
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
				
				ProductModel product=new ProductModel(rs.getString("id"),rs.getString("name"), rs.getInt("price"));
				products.add(product);
				
				}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return products;
   }
   
   
   
   
public int save(ProductModel product){
	int n=0;
	   	   
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
			String query="insert into product values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, product.getId());
			stmt.setString(2,product.getName());
			stmt.setDouble(3,product.getPrice());
            n=stmt.executeUpdate();
			ResultSet rs=stmt.executeQuery();
			
			System.out.println(" ");
			System.out.println("---Product Table---");
			System.out.println(" ");
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return n;
   }
   
}
