package com.ram.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Authentication extends HttpServlet{
Connection connection;
	public void init(){

		String st=getInitParameter("p1");
		String str=getInitParameter("p2");
		
	

  try {
	Class.forName(st);

  connection=DriverManager.getConnection(str);
  
  
  
  
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
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	  
  }
  
  public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
	  
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  
	  
	  boolean flag=false;
	  
	  try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM EMPLOYEE VALUES WHERE USERID=? PASSWORD=?");
	
		
		  String st=req.getParameter("t1");
		  String str=req.getParameter("t2");
	
		  ps.setString(1, st);
		  ps.setString(2, str);
		  
		  ResultSet rs=ps.executeQuery();
		  if(rs.next()){
			  flag=true;
			  rs.close();
			  ps.close();
		  }
	  
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  out.println("<html>");
	  out.println("<body bgcolor=green>");
	  if(flag){
	  
	  out.println("<h1>welcome to the servlet</h1>");
	  }
	  else{
		  out.println("<h1>invalid username and password");
	  out.println("<a href=login.html><h2>try again></h2></a>");
	  
	  }
	  out.println("</html>");
  out.println("</body>");
  out.close();
  
	}








}
