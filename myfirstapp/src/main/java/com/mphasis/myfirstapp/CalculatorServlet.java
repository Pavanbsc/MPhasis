package com.mphasis.myfirstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("first"));
        int num2 = Integer.parseInt(req.getParameter("second"));
        String operator = req.getParameter("operator");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        switch (operator) {
            case "+":
                out.println("<h2>RES: " + (num1 + num2) + "</h2>");
                break;
            case "-":
                out.println("<h2>RES: " + (num1 - num2) + "</h2>");
                break;
            case "*":
                out.println("<h2>RES: " + (num1 * num2) + "</h2>");
                break;
            case "/":
            	 out.println("<h2>RES: " + (num1 / num2) + "</h2>");
                break;
            default:
                out.println("<h2>Invalid operator</h2>");
        }
    }
}
