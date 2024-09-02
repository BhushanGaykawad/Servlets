import javax.servlet.*;
import java.io.*;
import java.util.*;
public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response)
	throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		out.println("<hmtl>");
		out.println("<body>");
		out.println("<h2>");
		out.println("a--->"+context.getInitParameter("a")+"<br>");
		out.println("b--->"+context.getInitParameter("b")+"<br>");
		out.println("c--->"+config.getInitParameter("c")+"<br>");
		out.println("d--->"+config.getInitParameter("d")+"<br>");
		out.println("e--->"+config.getInitParameter("e")+"<br>");
		out.println("f--->"+config.getInitParameter("f")+"<br>");
		out.println("</h2></body></html>");


		
	}
}