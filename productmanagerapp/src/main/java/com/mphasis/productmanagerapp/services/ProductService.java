package com.mphasis.productmanagerapp.services;

import java.util.ArrayList;
import java.util.List;

import com.mphasis.productmanagerapp.dao.ProductDAO;
import com.mphasis.productmanagerapp.model.ProductModel;

public class ProductService {
   private List<ProductModel> products=new ArrayList<>();
   
   private ProductDAO productDAO= new ProductDAO();
   
   public List<ProductModel> getAllProducts(){
	   return productDAO.findAll();
   }
   
   public int saveProduct(ProductModel product) {
	    return productDAO.save(product);
   }
}
