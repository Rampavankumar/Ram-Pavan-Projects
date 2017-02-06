package com.ram.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SalaryDetails extends GenericServlet{

	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sal=request.getParameter("t1");
		float basicsalary=Float.parseFloat(sal);
		
		float f=basicsalary*0.5f;
		float fl=basicsalary*0.2f;
		float gross=basicsalary+fl+f;
		 float deductions = gross*0.15f;
		   float net= gross-deductions;
		
		out.println("<html>");
		out.println("<body bgcolor=blue>");
		out.println("<h1 take home salary>"+net+"</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
