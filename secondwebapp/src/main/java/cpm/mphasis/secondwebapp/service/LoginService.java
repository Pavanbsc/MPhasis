package cpm.mphasis.secondwebapp.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
	private Map<String, String> users = new HashMap<>();
	public LoginService() {
		users.put("Tom","123");
		users.put("jai", "456");
		users.put("jerry", "789");
		
		
	}
	
    public boolean check(String login, String password) {
    	String value = users.get(login);
        if(password.equals(value))
        	return true;
        else
        	return false;
    }
}
