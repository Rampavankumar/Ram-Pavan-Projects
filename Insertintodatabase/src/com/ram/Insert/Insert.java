package com.ram.Insert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insert extends HttpServlet{
	
	Connection connect;
	public void init(ServletConfig config){
		
		String st=config.getInitParameter("p1");
		String conn=config.getInitParameter("p2");
		System.out.println(st);
		System.out.println(conn);
		
		
	try {
		Class.forName(st);
	connect=DriverManager.getConnection(conn);
	
	
	
	
	
	
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
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		pw.println("<html>");
		pw.println("<body bgcolor=blue>");
		try {
			PreparedStatement ps=connect.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
		
		
		
		
		/*String st=req.getParameter("t2");
		String str=req.getParameter("t3");
		String Stri=req.getParameter("t4");*/
		/*String String=req.getParameter("t5");*/
		int a=Integer.parseInt(req.getParameter("t1"));
		int b=Integer.parseInt(req.getParameter("t2"));
		String c=(req.getParameter("t3"));
		int d=Integer.parseInt(req.getParameter("t4"));
		String e=(req.getParameter("t5"));
		
		
		
		
		
		ps.setInt(1, a);
		ps.setInt(2, b);
		ps.setString(3, c);
		ps.setInt(4, d);
		
		ps.setString(5, e);
		
		
		ps.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pw.println("<h1>record entered successfully");
		pw.println("<a href=insert.html>one more account to create?</a>");
		pw.println("</body");
		pw.println("/html>");
		pw.close();
		
		
	}
	
	
}