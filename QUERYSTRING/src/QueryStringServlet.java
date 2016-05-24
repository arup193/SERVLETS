import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class QueryStringServlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int x = Integer.parseInt(req.getParameter("v1"));
		int y = Integer.parseInt(req.getParameter("v2"));
		out.print("<html> <body bgcolor=green text=white> <h1>");
		if(x>y)
			out.print("X value is big");
		else
			out.print("Y value is big");
	}
}