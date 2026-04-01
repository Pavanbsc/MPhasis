package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/report")

public class SimpleReport extends HttpServlet{
	
	List<String> courses =Arrays.asList("java","spring","html");
	
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out= resp.getWriter();
	out.println("<table><tr><th>COURSE</th></tr></table>");
	for(String c :courses) {
		out.println("<tr><td> "+ c +"</td></tr>>");
	}
}
}
