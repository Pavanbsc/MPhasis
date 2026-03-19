package com.mphasis.secondwebapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/counter")
public class HitCounter extends HttpServlet {
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {

     resp.setContentType("text/html");

     HttpSession session = req.getSession();
     Integer count = (Integer) getServletContext().getAttribute("count");

     if (count == null) {
         count = 0;
     }
     if (session.getAttribute("counted") == null) {
         count++;
         session.setAttribute("counted", true);
         getServletContext().setAttribute("count", count);
     }

     resp.getWriter().println("<h2>Sessions: " + count + "</h2>");
 }
}
