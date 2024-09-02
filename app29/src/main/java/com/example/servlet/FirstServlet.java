package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		
		HttpSession httpsession=request.getSession();
		httpsession.setAttribute("uname", uname);
		httpsession.setAttribute("upwd", upwd);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("form2.html");
		requestDispatcher.forward(request, response);
	}

}
