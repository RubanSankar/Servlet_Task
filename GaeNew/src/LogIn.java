

import java.io.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogIn
 */
@WebServlet("/login")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	 
	 
       
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 HashMap<String,String> obj=new HashMap<String,String>();
		 obj.put("admin1","pass1");
		 obj.put("ruban","admin");
		 obj.put("admin","admin");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		
		if(pass.equals(obj.get(name)))
		{
			Cookie obj1= new Cookie("name",name);
			response.addCookie(obj1);
			 RequestDispatcher rd=request.getRequestDispatcher("welcome");  
			 rd.forward(request, response);
		}
		else
		{
			    out.print("Sorry UserName or Password Error!\n");
			    
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);  
		}
		
	}

}
