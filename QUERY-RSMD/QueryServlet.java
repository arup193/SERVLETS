import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.sql.*;
import java.sql.*;
public class QueryServlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String query = req.getParameter("query");
		out.print("<html> <body bgcolor=green text=yellow>");
		out.print("<table border=1 align=center>");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int nc = rsmd.getColumnCount();
			out.print("<tr>");
			for(int i=1;i<=nc;i++)
			{
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");
			}
			out.print("</tr>");
			while(rs.next())
			{
				out.print("<tr>");
				for(int j=1;j<=nc;j++)
				{
					out.print("<td>"+rs.getString(j)+"</td>");
				}
				out.print("</tr>");
			}
		}
		catch (Exception e)
		{
			out.print("<h1>"+e+"</h1>");
		}
		out.print("</table> </body> </html>");
	}
}