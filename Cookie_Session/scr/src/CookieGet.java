package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieGet
 */
@WebServlet("/CookieGet")
public class CookieGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
        String cookieName1 = "name";
        String cookieName2 = "surname";
        Cookie cookie1 = null;
        Cookie cookie2 = null;
       int count=0;
        if(cookies !=null) {
            for(Cookie c: cookies) {
                if(cookieName1.equals(c.getName())) {
                    cookie1 = c;  
                    count++;
                    
                }
                if(cookieName2.equals(c.getName())) {
                    cookie2 = c;   
                    count++;
                }
                if (count==2)
                {
                	break;
                }
            }
        }
        PrintWriter out = response.getWriter();
        try {
            out.println("Name: " + cookie1.getValue()+"\n Surname: "+cookie2.getValue());
           
        }
        finally {
            out.close();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
