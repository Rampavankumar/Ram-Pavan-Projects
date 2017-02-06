package com.ram.studentMarks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentMarks extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{

res.setContentType("text/html");

PrintWriter out=res.getWriter();

String s=req.getParameter("t1");
String s1=req.getParameter("t2");
String s2=req.getParameter("t3");
String s3=req.getParameter("t4");
String s4=req.getParameter("t5");


int a=Integer.parseInt(s);
int b=Integer.parseInt(s1);
int c=Integer.parseInt(s2);
int d=Integer.parseInt(s3);
int e=Integer.parseInt(s4);


int average=(a+b+c+d+e)/5;
System.out.println(average);
String grade=null;

if(average<40){
	grade="you have failed";
}
else if(average>40&&average<60){
	grade="you got C grade";
}
else if(average>60&&average<80){
	grade="you got B grade";
}
else if(average>80&&average<90){
	grade="you got A grade";
}
else{
	grade="you passed in distinction";
}

System.out.println("The avearge of your marks is "+average);

out.println("<html>");
out.println("<body bgcolor=red>");
out.println("<h1>The average of your marks and your grade was "+average+"</h1>");
out.println("<h1>"+grade+"</h1>");
out.println("</body>");
out.println("</html>");

	
	
	
	}
}
	
	
