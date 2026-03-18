package com.mphasis.myfirstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletb")
public class ServletB extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
	   
	String company = (String)req.getAttribute("company");
	String training = (String)req.getAttribute("training");
	String location = (String)req.getAttribute("location");
	
//	out.println("this is servlet B");
	out.println("<h3>Company: "+company +"</h3>");
	out.println("<h3>Location: "+location +"</h3>");
	out.println("<h3>training: "+training +"</h3>");
}
}
