package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculatorCookie")
public class CalculatorServletCookie extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int x = 0;
		int y = 0;
		

		Cookie[] cookie = req.getCookies();
		for (Cookie c : cookie) {
			if (c.getName().contentEquals("x")) {
				x = Integer.parseInt(c.getValue());
			}
			if (c.getName().equals("y")) {
				y = Integer.parseInt(c.getValue());
			}
		}

		PrintWriter out = res.getWriter();

		out.println("<b>Sum= </b> " + sum(x, y) + "</br>");
		out.println("<b>Sub= </b> " + sub(x, y) + "</br>");
		out.println("<b>Mul= </b> " + mul(x, y) + "</br>");
		out.println("<b>Div= </b> " + div(x, y) + "</br>");

	}

	private int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}

	private int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	private int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	private int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
}
