package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.ior.Writeable;

@WebServlet("/calculatorSession")
public class CalculatorServletSession extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession();
		int x = (int) session.getAttribute("x");
		int y = (int) session.getAttribute("y");
		

		PrintWriter out = res.getWriter();

		out.println("Sum is  " + x + " + " + y + " = " + sum(x, y));
		out.println("Sub is  " + x + " - " + y + " = " + sub(x, y));
		out.println("Mul is  " + x + " * " + y + " = " + mul(x, y));
		out.println("Div is  " + x + " / " + y + " = " + div(x, y));

	
		//here session is removed ...no more access x and y attributes
		session.removeAttribute("x");
		session.removeAttribute("y");

		int a = (int) session.getAttribute("x");
		int b = (int) session.getAttribute("y");
		

		out.println("Sum is  " + x + " + " + y + " = " + sum(a, b));
		
	}

	private int div(int x, int y) {
		return x / y;
	}

	private int mul(int x, int y) {
		return x * y;
	}

	private int sub(int x, int y) {
		return x - y;
	}

	private int sum(int x, int y) {
		return x + y;
	}
}
