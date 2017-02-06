package ram.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class SubractServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Serice started");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String a = request.getParameter("s1");
		String b = request.getParameter("s2");

		int t1 = Integer.parseInt(a);
		int t2 = Integer.parseInt(b);
		
		int s=t1+t2;
		
		System.out.println("the numbers after subraction: "+s);
		
		pw.println("<html>");
		pw.println("<body bgcolor=green>");
		pw.println("<h1> The Sum of two number is:"+s+"</h1>");
		pw.println("</body>");
		pw.println("</html>");

		
		
		
		
		
		

	}

}
