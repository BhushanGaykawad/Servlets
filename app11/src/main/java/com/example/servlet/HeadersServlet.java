package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/headers")
public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		Enumeration<String> headerNames=request.getHeaderNames();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border ='1'>");
		out.println("<tr><td colspan='2' align='center'>Request Headers Data </td></tr>");
		out.println("<tr><th>Header Name</th> <th>Header Values</th></tr>");
		while (headerNames.hasMoreElements()){
			String headerName=headerNames.nextElement();
			String headerValue=request.getHeader(headerName);
			out.println("<tr>");
			out.println("<td>"+headerName+"</td>");
			out.println("<td>"+headerValue+"</td>");
			out.println("</tr>");
		}
		out.println("</table></body></html>");		
	}
	

}
