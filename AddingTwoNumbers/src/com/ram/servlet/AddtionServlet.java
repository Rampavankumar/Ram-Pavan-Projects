package com.ram.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddtionServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Serice started");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("t1");//20
		String b=request.getParameter("t2");//12
		
		int n1 = Integer.parseInt(a);
		int n2 =Integer.parseInt(b);
		
		int sum = n1-n2;
		
		
		System.out.println("The sum of entered numbers is  "+sum);
		
		
		out.println("<html>");
		out.println("<body bgcolor=green>");
		out.println("<h1> The Sum of two number is:"+sum+"</h1>");
		out.println("</body>");
		out.println("</html>");

		
				
	}
	

}
