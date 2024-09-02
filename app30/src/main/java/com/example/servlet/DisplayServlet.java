package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String semail=request.getParameter("semail");
		String smobile=request.getParameter("smobile");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		Cookie[] cookies=request.getCookies();
		String sid=cookies[0].getValue();
		String sname=cookies[1].getValue();
		String squal=cookies[2].getValue();
		String saddr=cookies[3].getValue();
		System.out.println("******"+cookies.toString());
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 align='center' style='color:red;'>ABC SOftware Solutions</h2>");
		out.println("<h3 align='center' style='color:blue'>Student Registration Details</h3>");
		out.println("<table border='1' align='center'");
		out.println("<tr><td>Student ID</td><td>"+sid+"</td></tr>");
		out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
		out.println("<tr><td>Student Qualification</td><td"+squal+"</td></tr>");
		out.println("<tr><td>Student Address</td><td>"+saddr+"</td></tr>");
		out.println("<tr><td>Student Email</td><td>"+semail+"</td></tr>");
		out.println("<tr><td>Student Mobie</td><td>"+smobile+"</td></tr>");
		out.println("</table></body></html>");
	}

}
