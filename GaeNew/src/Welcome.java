

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
		        throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String name=request.getParameter("uname");  
		    out.print("Welcome "+name);  
		    
		      
	          
	        RequestDispatcher rd=request.getRequestDispatcher("/LogOut.html");  
	        rd.include(request, response);
	       
	        
	        
		    }  

}
