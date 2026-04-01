package com.mphasis.productmanagerapp.services;

import com.mphasis.productmanagerapp.model.UserModel;

public class LoginService {
  public boolean check(UserModel userModel) {
	  if(userModel.getLogin().equals("pavan") && userModel.getPassword().equals("123")) {
		  return true;
	  }else{
		  return false;
	  }
  }
}
