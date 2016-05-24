import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Details extends HttpServlet
{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("na");
		String gender = req.getParameter("gender");
		String course = req.getParameter("cou");
		String add = req.getParameter("add");
		String ho[] = req.getParameterValues("h");
		String city[] = req.getParameterValues("city");
		out.print("<html> <body Background=Backs.jpg>");
		out.print("<EMBED src=Mus.mp3 start=true hidden=true>");
		out.print("<marquee scrollamount=20 behaviour=alternate> <h1 align=center><font face=Forte size=20 Color=BLACK>Student Details</font></h1> </marquee>");
		out.print("<hr size=3 color=BLACK width=70% align=center> <br><br>");
		out.print("<table align=center>");
			out.print("<tr><td><font face=Gulim size=5 Color=BLUE>Name :</font></td><td><font face=Freestyle Script size=5 Color=GREEN>"+name+"</font></td></tr>");
			out.print("<tr><td><font face=Gulim size=5 Color=BLUE>Gender :</font></td><td><font face=Freestyle Script size=5 Color=GREEN>"+gender+"</font></td></tr>");
			out.print("<tr><td><font face=Gulim size=5 Color=BLUE>Course :</font></td><td><font face=Freestyle Script size=5 Color=GREEN>"+course+"</font></td></tr>");
			out.print("<tr><td><font face=Gulim size=5 Color=BLUE>Address :</font></td><td><font face=Freestyle Script size=5 Color=GREEN>"+add+"</font></td></tr>");
			out.print("<tr><td><font face=Gulim size=5 Color=BLUE>Hobbies :</font></td>");
			for(int i=0;i<ho.length;i++)
			{
				out.print("<td><font face=Freestyle Script size=5 Color=GREEN>"+ho[i]+"</font></td></tr><tr><td></td>");
			}
			out.print("</tr><tr><td><font face=Gulim size=5 Color=BLUE>Cities :</font></td>");
			for(int j=0;j<city.length;j++)
			{
				out.print("<td><font face=Freestyle Script size=5 Color=GREEN>"+city[j]+"</font></td></tr><tr><td></td>");
			}
		out.println("</tr>");
		out.print("</table> </marquee>");
		out.print("</EMBED> </body> </html>");
	}
}