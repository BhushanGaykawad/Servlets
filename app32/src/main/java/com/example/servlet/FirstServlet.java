package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>ABC SOftware SOlutions</h2>");
		out.println("<h3 style='color:blue;' align='center'>Customer Registration form[cont...]</h3>");
		out.println("<form method='POST' action='./second'>");
		out.println("<table align='center'");
		out.println("<tr><td>Customer Address</td><td><input type='text' name='caddr'/></td></tr>");
		out.println("<tr><td>Customer Type</td><td><input type='text' name='ctype'/></td></tr>");
		out.println("<tr><td><input type='submit' value='NEXT'/></td></tr>");
		out.println("<input type='hidden' name='cid' value='"+cid+"'/>");
		out.println("<input type='hidden' name='cname' value='"+cname+"'/>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body></html");

	}

}
