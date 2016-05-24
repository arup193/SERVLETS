import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SumServlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int x = Integer.parseInt(req.getParameter("v1"));
		int y = Integer.parseInt(req.getParameter("v2"));
		int s = x+y;
		out.print("<html> <body bgcolor=BLUE text=BLACK> <h1> Sum is "+s+"</h1> </body> </html>");
	}
}