package com.ram.applicationscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationScope1 extends HttpServlet{
	
	public void doget(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		ServletContext context1=getServletContext();//why no req here
		
		
		
		String pn=(String) context1.getAttribute("number");
		System.out.println(pn);
		pw.println("<html>");
		pw.println("<body bgcolor=green>");
		pw.println("<h1>"+context1.getInitParameter("admin")+"</h1>");
		pw.println("<h1>the policy number is"+pn+"</h1>");
		pw.println("/body>");
		pw.println("</html>");
		pw.close();
		
		
		
		
	}

}
