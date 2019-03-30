package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculatorTwo")
public class CalculatorServletRedirect extends HttpServlet{


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
		
		System.out.println("Hello Abdu");
//		int x = (int) req.getAttribute("x");
//		int y = (int) req.getAttribute("y");
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		
		int z = x*y;
	 	
		PrintWriter out = res.getWriter();
		
	 	out.println("Sum is  "+x + " + " + y +" = "+ sum(x, y));
		 
	 	out.println("<b>Result is </b>"+ z);
	}

 

	private int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
}
