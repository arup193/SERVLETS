import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
public class InsertServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int dno = Integer.parseInt(req.getParameter("dno"));
		String dname = req.getParameter("dname");
		String loc = req.getParameter("loc");
		out.print("<html> <body bgcolor=BLUE text=BLACK>");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			PreparedStatement pst = con.prepareStatement("INSERT INTO DEPT1 VALUES(?,?,?)");
			pst.setInt(1,dno);
			pst.setString(2,dname);
			pst.setString(3,loc);
			int i = pst.executeUpdate();
			if(i>0)
				out.print("<h1>Record is Inserted</h1>");
			else
				out.print("<h1>Record is not Inserted</h1>");
			con.close();
		}
		catch (Exception e)
		{
			out.print("<h1>"+e+"</h1>");
		}
		out.print("</body> </html>");
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		doPost(req,res);
	}
}