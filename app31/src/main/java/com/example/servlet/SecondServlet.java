package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String accType=request.getParameter("accType");
		String accBranch=request.getParameter("accBranch");
		
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("accType", accType);
		httpSession.setAttribute("accBranch", accBranch);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red;' align='center'>ABC Banking Services</h2");
		out.println("<h3 style='color:red;' align='center'>Deposit Form [continuation]</h3>");
		out.println("<form method='POST' action='"+response.encodeURL("./deposit")+"'>");
		out.println("<table align='center'>");
		out.println("<tr><td>Deposit Amount</td><td><input type='text' name='depAmt'/></td></tr>");
		out.println("<tr><td>Depositor Name</td><td><input type='text' name='depName'/></td></tr>");
		out.println("<tr><td><input type='submit' value='Deposit'/></td></tr>");
		out.println("</table></form></body></html>");
		
	}

}
