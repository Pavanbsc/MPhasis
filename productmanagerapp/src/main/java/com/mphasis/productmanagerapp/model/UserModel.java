package com.mphasis.productmanagerapp.model;

import java.io.PrintWriter;
import java.util.Objects;

public class UserModel {
 
  
  public UserModel(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
private String login;
  private String password;
  
 
  
  public String getLogin() {
	return login;
  }
  public void setLogin(String login) {
	this.login = login;
  }
  public String getPassword() {
	return password;
   }
   public void setPassword(String password) {
	this.password = password;
   }

	
}

