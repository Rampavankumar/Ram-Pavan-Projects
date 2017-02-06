package com.ram.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Source extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String st=req.getParameter("t1");
		HttpSession session=req.getSession();
		session.setAttribute("ram", st);
		
		pw.println("<html>");
		pw.println("<body bgcolor=green>");
		pw.println("<a href="+resp.encodeURL("./target")+">get user name</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		
	}
	
	

}
