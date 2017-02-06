package com.ram.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieExample extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		String s=req.getParameter("t1");
		String s1=req.getParameter("t2");
		
		Cookie cook=new Cookie(s, s1);
		
		cook.setMaxAge(300);
		
		resp.addCookie(cook);
		//resp.addcookie andhuku pettam
		
		
		pw.println("<a href=./cook>get your preferences here</a>");
		pw.close();
		
		
		
		
	}
	
	
}
