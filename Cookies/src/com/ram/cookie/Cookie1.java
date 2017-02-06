package com.ram.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet{
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String color=null;
		String sport=null;
		Cookie[] k=req.getCookies();
		
		if(k!=null){
			
			for(int i=0;i<k.length;i++){
				
				String name=k[i].getName();//ikkada ardam kaledhu getbame anedhi ala vunpayogapadindhi asalu e forloop ardam kaledhu asalu 
				//url andhuku asalu
				if(name.equals("s"))
				color=k[i].getValue();
					    
				else
					sport=k[i].getValue();
			}
		}
		resp.setContentType("text/html");
		PrintWriter pw= resp.getWriter();
		pw.println("<html>");
		pw.println("<body bgcolor="+color+">");
		pw.println("<marquee><font size=6>"+sport+"</marquee>");
		pw.close();
	}



			
			
		}
		
		
	
	
	


