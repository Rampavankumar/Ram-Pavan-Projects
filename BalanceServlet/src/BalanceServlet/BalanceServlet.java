package BalanceServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;


	
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class BalanceServlet extends HttpServlet {

		Connection connection;

		public void init(ServletConfig config) throws ServletException {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe","admin","admin");
				System.out.println("Connection Established");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void destroy(){
			
			try{
				connection.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<HTML>");
		pw.println("<BODY bgcolor=grey>");
		try{
			Statement st= connection.createStatement();
			
			int a=Integer.parseInt(req.getParameter("t1"));
			ResultSet rs = st.executeQuery("SELECT * FROM customer WHERE ACCOUNTNO= "+a);
			if(rs.next()){
				pw.println("<h1>Balance is :Rs"+rs.getInt(1));
		  	pw.println("<h1>Account no is :"+rs.getInt(2));
			}
			else
				pw.println("<h1> Account Does Not exist");
			rs.close();
			st.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		pw.println("</BODY></HTML>");
		pw.close();
		
	}

	
	}
/*public class BalanceServlet extends HttpServlet {
	Connection conn;
	public void init() {
Connection conn;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbcuser",
					"jdbcuser");

			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

public void destroy(){
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	

	
public void doGet(HttpServletResponse responce,HttpServletRequest request) throws IOException, SQLException{
	
responce.setContentType("text/html");
PrintWriter pw=responce.getWriter();
pw.println("<html>");
pw.println("<body bgcolor=red>");

Statement st=conn.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER WHERE ACCOUNTNO='"+request.getParameter("t1")+"'");
if(rs.next()){
	pw.println("<h1>Balance is :Rs"+rs.getInt(1));
	pw.println("<h1>Account no is :"+rs.getInt(2));
}
else
	pw.println("<h1> Account Does Not exist");
rs.close();
st.close();



}
	
	
}
*/