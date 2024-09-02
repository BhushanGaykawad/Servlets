import javax.servlet.*;
import java.io.*;
public class WelcomeServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response)
	throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<font color='red' size='7'>");
		out.println("<b>");
		out.println("Welcome to MyServlet</font><br>");
		out.println("<font color='blue' size='5'>");

		out.println("This is the demo for the Generic Servlet");
		out.println("</b><hr></font></body></htmll>");

	}
}