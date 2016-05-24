import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class TableQS extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int x = Integer.parseInt(req.getParameter("v1"));
		out.print("<html> <body bgcolor=BLUE>");
		out.print("<table border=0 align=center>");
		for(int i=1;i<=10;i++)
		{
			out.print("<tr><h1><td>"+x+"</td><td>*</td><td>"+i+"</td><td>"+(x*i)+"</td></h1></tr> <br>");
		}
		out.print("</table> </body> </html>");
	}
}