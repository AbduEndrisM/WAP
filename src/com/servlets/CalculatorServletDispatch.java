
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculatorOne")
public class CalculatorServletDispatch extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int x =    (int) req.getAttribute("x");
		int y =  (int) req.getAttribute("y");
		int m = (int) req.getAttribute("pow");
		int z =x+y;
		
//		PrintWriter out = res.getWriter();
		res.getWriter().println("Add is  "+x + " + " + y +" = "+z);
		res.getWriter().println("Pow is   = "+m);
		
	}
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		String x = req.getParameter("num1");
//		String y = req.getParameter("num2");
//		int z = Integer.parseInt(x) + Integer.parseInt(y);
		
//		int x = Integer.parseInt(req.getParameter("num1"));
//		int y = Integer.parseInt(req.getParameter("num2"));
//				
		int x = (int) req.getAttribute("x");
		int y =(int) req.getAttribute("y");
		
		PrintWriter out = res.getWriter();
		
		out.println("Power  is "+ req.getAttribute("pow"));
		
		out.println("Result is  "+x+ " + " + y +" = "+sum(x, y));
		out.println("Result is  "+x + " - " + y +" = "+sub(x, y));
		out.println("Result is  "+x + " * " + y +" = "+mul(x, y));
		out.println("Result is  "+x + " / " + y +" = "+div(x, y));
		
	}


	private int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}


	private int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}


	private int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}


	private int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	

	
}
