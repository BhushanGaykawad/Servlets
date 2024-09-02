package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uemail=request.getParameter("uemail");
		String umobile=request.getParameter("umobile");
		
		HttpSession httpSession=request.getSession(false);
		String uname=(String)httpSession.getAttribute("uname");
		String upwd=(String)httpSession.getAttribute("upwd");
		String uprof=(String)httpSession.getAttribute("uprof");
		String uaddr=(String)httpSession.getAttribute("uaddr");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>ABC Software Solutions</h2>");
		out.println("<h3 style='color:blue;'  align='center'>User Registration Details</h3> ");
		out.println("<table align='center' border='1'");
		out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
		out.println("<tr><td>User Password</td><td>"+upwd+"</td></tr>");
		out.println("<tr><td>User Profession</td><td>"+uprof+"</td></tr>");
		out.println("<tr><td>User Address</td><td>"+uaddr+"</td></tr>");
		out.println("<tr><td>User Email ID</td><td>"+uemail+"</td></tr>");
		out.println("<tr><td>User Mobile NO</td><td>"+umobile+"</td></tr>");
		out.println("</table></body></html>");

	}

}
