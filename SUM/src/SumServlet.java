import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SumServlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		int x = 10;
		int y = 20;
		int s = x+y;
		pw.print("SUM IS : "+s);
	}
}