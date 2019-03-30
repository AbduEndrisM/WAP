package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		int z = (int) Math.pow(x, y);

		PrintWriter out = res.getWriter();

		out.println("<html>Result is  </html>" + req.getParameter("num1") + " Pow " + req.getParameter("num2") + " = " + z); 
		out.print("Result is  " + x + " Pow " + y + " = " + z);

//		req.setAttribute("x", x);
//		req.setAttribute("y", y);
//		req.setAttribute("pow", z);

//		RequestDispatcher rd = req.getRequestDispatcher("calculatorOne");
//		rd.forward(req, res);

//		res.sendRedirect("calculatorTwo");
//		res.sendRedirect("calculatorTwo?x=5&y=7");

//		HttpSession session = req.getSession();
//		session.setAttribute("x", x);
//		session.setAttribute("y", y);
//		res.sendRedirect("calculatorSession");

//		Cookie  cookie1 =  new Cookie("x", x + "");
//		Cookie  cookie2 =  new Cookie("y", y + "");
//		res.addCookie(cookie1);
//		res.addCookie(cookie2);
//
//		res.sendRedirect("calculatorCookie");
	}
}
