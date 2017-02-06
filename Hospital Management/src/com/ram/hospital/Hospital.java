package com.ram.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Hospital extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		String string=req.getParameter("s");
		
		HttpSession session=req.getSession();
		
		System.out.println("the session id is  "+session.getId());
System.out.println("Is it a new session "+session.isNew());
System.out.println("The time of this session is "+session.getMaxInactiveInterval());
session.setMaxInactiveInterval(120);
if(string.equals("Add disease")){
	String s=req.getParameter("t1");
	String str=req.getParameter("disease");
	session.setAttribute(s, str);
	resp.sendRedirect("hospital.html");
	
	
	
}
if(string.equals("Delete disease")){
	String str=req.getParameter("disease");
	session.removeAttribute(str);
	resp.sendRedirect("hospital.html");
	
}

if(string.equals("Show diseases and Doctor")){
	
	Enumeration e=session.getAttributeNames();
	
	if(e.hasMoreElements()){
		
		pw.println("<h1 fontcolor=black>there are more diseases</h1>");
	}
	
	while(e.hasMoreElements()){
		
		pw.println("<body bgcolor=green</body>");
		
		String ram=(String) e.nextElement();
		
		pw.println("<h2>the disease is "+ram);
		pw.println("the doctors for this disease are "+session.getAttribute(ram));
		
	}
}
	else{
pw.println("<body bgcolor=green");
pw.println("<h2>there are no diseases selected</h2>");
pw.println("<a href=shopping.html>you want to select your disease again</a>");
	}
		
		if(string.equals("Logout")){
			
			session.invalidate();
			pw.println("<body bgcolor=green");
			pw.println("<a href=shopping.html>you want to select your disease again</a>");
			
			
		}
		
		
	}
	
	
	


		
		
	}
	
	


