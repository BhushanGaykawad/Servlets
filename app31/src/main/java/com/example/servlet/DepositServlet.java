package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.service.TransactionService;

@WebServlet("/deposit")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			int depAmt=Integer.parseInt(request.getParameter("depAmt"));
			String depName=request.getParameter("depName");
			
			HttpSession httpSession=request.getSession(false);
			String accNo=(String)httpSession.getAttribute("accNo");
			String accHolderName=(String)httpSession.getAttribute("accHolderName");
			String accType=(String)httpSession.getAttribute("accType");
			String accBranch=(String)httpSession.getAttribute("accBranch");
			
			TransactionService txService=new TransactionService();
			
			int totalAmt=txService.deposit(accNo, depAmt);
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red;' align='center'>ABC Banking Services</h2");
			out.println("<h3 style='color:red;' align='center'>Transaction Details</h3>");
			out.println("<table border='1' aling='center'");
			out.println("<tr><td>Account Number</td><td>"+accNo+"</td></tr>");
			out.println("<tr><td>Account Holder Name</td><td>"+accHolderName+"</td></tr>");
			out.println("<tr><td>Account Type</td><td>"+accType+"</td></tr>");
			out.println("<tr><td>Account Branch</td><td>"+accBranch+"</td></tr>");
			out.println("<tr><td>Transaction Type</td><td>DEPOSIT</td></tr>");

			out.println("<tr><td>Deposit Amount</td><td>"+depAmt+"</td></tr>");
			out.println("<tr><td>Depositor Name</td><td>"+depName+"</td></tr>");
			out.println("<tr><td>Total Balance</td><td>"+totalAmt+"</td></tr>");

			out.println("<tr><td>Transaction Status</td><td>SUCCESS</td></tr>");
			out.println("</table>");
			out.println("</body");
			out.println("</html>");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
