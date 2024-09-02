package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name = "AnnotatedServlet", 
		urlPatterns = { "/welcome" }, 
		loadOnStartup=1,
		initParams = { 
				@WebInitParam(name = "a", value = "AAA"), 
				@WebInitParam(name = "b", value = "BBB")
		})
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet Loading");
	}
	public WelcomeServlet(){
		System.out.println("Servlet Instantiation");
	}
	public void init() throws ServletException{
		System.out.println("Servlet initialization");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType(("text/html"));
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Logical Name : "+config.getServletName()+"<br>");
		out.println("a----->"+config.getInitParameter("a")+"<br>");
		out.println("b----->"+config.getInitParameter("b")+"<br>");
		out.println("</h1></body></html>");
	}
	public void destroy()
	{
		System.out.println("Servlet Deinstantiation");
	}

}
