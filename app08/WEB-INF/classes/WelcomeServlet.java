import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet
{
	static{
		System.out.println(".....Servlet Loading............");
	}
	public WelcomeServlet()
	{
		System.out.println(".....Servlet Instantiation..........");

	}
	public void init()
	{
		System.out.println(".....Servlet Initialization..........");

	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println(".....Request Processing.........");
		
	}
	public void destroy()
	{
		System.out.println(".....Servlet Deinstantiation....");

	}
	
}