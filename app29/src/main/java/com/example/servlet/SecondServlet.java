package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uprof=request.getParameter("uprof");
		String uaddr=request.getParameter("uaddr");
		
		HttpSession httpSession=request.getSession(false);
		httpSession.setAttribute("uprof", uprof);
		httpSession.setAttribute("uaddr", uaddr);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("form3.html");
		requestDispatcher.forward(request, response);
	}

}
