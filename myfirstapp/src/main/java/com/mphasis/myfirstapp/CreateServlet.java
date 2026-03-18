package com.mphasis.myfirstapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class CreateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String city =req.getParameter("city");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if(name == null) {
			out.println("<h2>hello guest</h2>");
		}else {
		out.println("<h1><center>Hello "+ name +","+ city +"</center><h2>");
		}
	}
}
