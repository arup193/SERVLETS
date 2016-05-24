import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FacQS extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int f = Integer.parseInt(req.getParameter("v1"));
		int fac=1;
		for(int i=f;i>0;i--)
		{
			fac = fac*i;
		}
		out.print("<html> <body text=red> <h1>The Factorial of given number "+f+"is "+fac+"</h1> </body> </html>");
	}
}