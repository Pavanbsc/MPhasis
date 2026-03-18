package com.mphasis.myfirstapp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servleta")
public class ServletA extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
	req.setAttribute("company","Mphasis");
	req.setAttribute("training","java");
	req.setAttribute("location","pune");
	
	RequestDispatcher rd = req.getRequestDispatcher("/servletb");
	rd.forward(req, resp);
}
}
