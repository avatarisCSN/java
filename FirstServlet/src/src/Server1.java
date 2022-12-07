package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Server1
 */

public class Server1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Server1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	 int id = Integer.parseInt(request.getParameter("id"));
	      //  if(id ==5) {
		 response.setContentType("text/html");
	        PrintWriter writer = response.getWriter();
	        try {
	            writer.println("<h2>Welcome to servlets</h2>");
	        } finally {
	            writer.close();  
	        }    
	      //      String path = request.getContextPath() + "/NotFound";
	     //       response.sendRedirect(path);
	      //  }
	      //  else {
	      //      response.setContentType("text/html");
	       //     PrintWriter writer = response.getWriter();
	       //     try {
	       //         writer.println("<h2>Hello Id " + id + "</h2>");
	      //      } finally {
	       //         writer.close();  
	       //     }
	       // }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
