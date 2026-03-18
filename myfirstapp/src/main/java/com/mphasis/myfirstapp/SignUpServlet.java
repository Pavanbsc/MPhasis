package com.mphasis.myfirstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/signup")

public class SignUpServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("fname");
		String email=req.getParameter("email");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(email.contains("gmail")) {
			RequestDispatcher rd=req.getRequestDispatcher("faliurepage.html");
			rd.forward(req, resp);
		}else {
			out.println("<h4><center> FULL NAME :"+name+" || EMAIL :"+email+" </center></h4>");
		out.println("<h2><center>Thank you for signing up</center></h2>");
		}
	}

}
