package com.ram.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Multiplication extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		
		String s=request.getParameter("s1");
		String st=request.getParameter("s2");
		
		int t1=Integer.parseInt(s);
		int t2=Integer.parseInt(st);
		
		int mul=t1*t2;
		
		System.out.println("the numbers after multiplication :"+mul);
		
		p.println("<html>");
		p.println("<body bgcolor=green>");
	
		p.println("<h1> the multiplication of two numners"+mul+"</h1>");
	
		p.println("</body>");
		p.println("/html");
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
