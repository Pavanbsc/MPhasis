package com.mphasis.productmanagerapp.customtags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport{
	private String fname;
  public void setFname(String fname) {
	this.fname = fname;
}
  public void doTag() throws JspException, IOException {
	  if(fname ==null) {
		  getJspContext().getOut().print("<h2>Hello Guest!!</h2>");
	  }else {
		  getJspContext().getOut().print("<h2>Hello: "+ fname +"!!</h2>");
	  }
	}
}
