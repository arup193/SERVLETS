import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MimeServlet extends HttpServlet
{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("application/vnd.ms-excel");
		PrintWriter out = res.getWriter();
		out.print("<table>");
		out.print("<tr><th>Eno</th><th>Ename</th><th>Salary</th></tr>");
		out.print("<tr><td>100</td><td>Sooraj</td><td>9000</td></tr>");
		out.print("<tr><td>101</td><td>Rajesh</td><td>8000</td></tr>");
		out.print("<tr><td>103</td><td>Rubal</td><td>7000</td></tr>");
		out.print("<tr><td>104</td><td>Sandeep</td><td>6000</td></tr>");
		out.print("</table>");
		out.close();
	}
}