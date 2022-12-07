package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLogging
 */
@WebServlet("/SessionLogging")
public class SessionLogging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLogging() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
        HttpSession session = request.getSession();
       String name2 = request.getParameter("name");
        String name = (String) session.getAttribute("name");
         
        PrintWriter out = response.getWriter();
        try {
            // если объект ранее не установлен
            if(name == null) {
                // устанавливаем объект с ключом name
                session.setAttribute("name", name2);
                out.println("Session data are set");
            }
            else {
                out.println("Name: " + name);
                // удаляем объект с ключом name
                session.removeAttribute("name");
            }
        }
        finally {
            out.close();
        }	
	}

}
