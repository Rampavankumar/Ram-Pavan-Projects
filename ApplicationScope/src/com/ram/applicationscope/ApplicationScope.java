package com.ram.applicationscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationScope extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String pno=req.getParameter("policy");
		
		ServletContext sc=getServletContext();
		
		sc.setAttribute("number", pno);
		
		pw.println("<html>");
		pw.println("<body bgcolor=green>");
		pw.println("<h1>"+sc.getInitParameter("admin")+"</h1>");
		pw.println("<a href=./target> Get your Policy Number</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
	
	
	
}
