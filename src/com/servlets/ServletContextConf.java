package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletContextConf extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		ServletContext ctx = req.getServletContext();
		String str = ctx.getInitParameter("name");

		PrintWriter out  = res.getWriter();
		
		out.print(str);

	}
}
