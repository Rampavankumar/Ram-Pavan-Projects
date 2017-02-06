package com.ram.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Source extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		HttpSession sess=req.getSession();
		System.out.println("the session id is"+sess.getId());
		System.out.println("It is new session?"+sess.isNew());
		System.out.println("time out in seconds in session is"+sess.getMaxInactiveInterval());
		
		sess.setMaxInactiveInterval(120);
		
		String sb=req.getParameter("s");
		
		if(sb.equals("Add item")){
			String item=req.getParameter("item");
			String qty=req.getParameter("t1");
			
			sess.setAttribute(item, qty);
			resp.sendRedirect("shopping.html");
		}
		
		if(sb.equals("Add item")){
		String shirt=req.getParameter("shirt");
		String qty=req.getParameter("t1");
		
		sess.setAttribute(shirt, qty);
		
		
		}
		
		
		else if(sb.equals("Remove item")){
			String item=req.getParameter("item");
		
			sess.removeAttribute(item);
			resp.sendRedirect("shopping.html");
		}
		
		else if(sb.equals("Remove item")){
			
			String shirt=req.getParameter("shirt");
			
			sess.removeAttribute(shirt);
			
			resp.sendRedirect("shopping.html");//asalu manam resp appudu vadatham and session appudu vadatham and sb ni andhuku mundhe piluchukunnam?session.getattribute of c annapudu andhuku qtantity display avthadi?//
			
		}
		
		
		
		
		else if(sb.equals("Show item")){
			
			Enumeration e=sess.getAttributeNames();
			if(e.hasMoreElements()){
				pw.println("<h2><font color=black>your shopping cart items</h2>");
				
				while(e.hasMoreElements()){
					pw.println("<body bgcolor=green>");
					String c=(String) e.nextElement();
					
					
					pw.println("<h2>brand name is "+c);
					
					pw.println("quantity is"+sess.getAttribute(c)+"</h2>");
					
					
				}          //please revise this program plzzzzzzzzzzzzzzzzzzzzzzzzzzz andhuku work avvatledhu?//
			}
				
				else if(sb.equals("show item")){
					
					Enumeration f=sess.getAttributeNames();
					
					if(f.hasMoreElements()){
						pw.println("<h2><font color=black>the shirts you chossen are</h2>");
					
						while(f.hasMoreElements()){
							
					String d=(String) f.nextElement();
					pw.println("<h2>type of the shirts are "+d);
					pw.println("quantity is"+sess.getAttribute(d)+"</h2>");
							
							
						}
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
			}
			else{
				
				pw.println("<body bgcolor=green>");
				pw.println("<h2>There are no items in the cart</h2>");
			}
				pw.println("<a href=shopping.html>want to shop again</a>");
		}
		else if(sb.equals("Log out")){
			
			sess.invalidate();
					pw.println("<body bg color=green>");
					pw.println("<a href=shopping.html>want to shop again</a>");
		}
					
		pw.close();			
				}
				
				
				
				
			
			
			
			
		
		}
		
		
		
		
	


