package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		RequestDispatcher requestDispatcher=null;
		if(uname.equals("Bhushan")&& upwd.equals("Bhushan@123")) {
			requestDispatcher=request.getRequestDispatcher("./success.html");
			requestDispatcher.forward(request, response);
			
		}else
		{
			requestDispatcher=request.getRequestDispatcher("./failure.html");
			requestDispatcher.forward(request, response);
		}
	}

}
