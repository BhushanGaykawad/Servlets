import javax.servlet.*;
import java.io.*;

public class WelcomeServlet implements Servlet
{
	public void init(ServletConfig config) throws ServletException
	{
	}
	
	public void service(ServletRequest request, ServletResponse response) throws
	ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("<font color='red'>");
		out.println("<b>");
		out.println("Welcome To MyServlet");
		out.println("</b><hr></font></h2></body></html>");

	}
	
	public ServletConfig getServletConfig()
	{
		return null;
	}
	public String getServletInfo()
	{
		return "";
	}
	public void destroy()
	{}
}