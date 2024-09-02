package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		System.out.println("=======++"+sname);

		Cookie c1=new Cookie("sid",sid);
		Cookie c2=new Cookie("sname",sname);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("form2.html");
		requestDispatcher.forward(request, response);
	}

}
