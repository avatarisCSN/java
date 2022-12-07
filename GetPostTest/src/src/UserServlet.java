package src;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.UserAction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import src.Connector;



/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("doPost");
		 String type = request.getParameter("type");
	        if ("login".equals(type)) {
	        	 login(request, response);
	        }
	        
	        if ("editZamovlDeveloper".equals(type)) {
	        	editZamovlDeveloper(request, response);
	        	 System.out.println("editZamovlDeveloper1");
	        }
	        if ("editZamovlitemDeveloper".equals(type)) {
	        	editZamovlitemDeveloper(request, response);
	        	 System.out.println("editZamovlitemDeveloper1");
	        }
	        if ("createListWorkZam".equals(type)) {
	        	createListWorkZam(request, response);
	        	 System.out.println("createListWorkZam");
	        }
	        if ("editListWorkZam".equals(type)) {
	        	editListWorkZam(request, response);
	        	 System.out.println("editListWorkZam");
	        }
	}
	        
	        public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        	
	 	    
	 	        	 String username = request.getParameter("name");
	 		            String password = request.getParameter("password");
	 		                     // Проверяем
	 		            
	 		            String flag = UserAction.Autorization(username, password);
	 		                     // Переход на страницу по результату проверки
	 		            System.out.println(flag);
	 		            if("Разработчик".equals(flag)){
	 		            	
	 		            	String path = "/Управление-тех-заказами.jsp";
	 		            	System.out.println(path);
	 		               ServletContext servletContext = getServletContext();
	 		               RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
	 		                requestDispatcher.forward(request, response);
	 		                 System.out.println(path);
	 		                
	 		            }else if("Менеджер".equals(flag))
	 		            {
	 		            	  
	 		            	  String path = "/виробничы-замовлення.jsp";
	 			                ServletContext servletContext = getServletContext();
	 			                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
	 			                requestDispatcher.forward(request, response);      
	 		            }
	 		            else
	 		            {
	 		            	String path = "/Авторизация.jsp";
	 		                ServletContext servletContext = getServletContext();
	 		                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
	 		                requestDispatcher.forward(request, response);
	 		                System.out.println("oshibka");
	 		            }   
	        }

	        public void editZamovlDeveloper(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        	Connection connection;
	        	 System.out.println("editZamovlDeveloper2");
	        	try {
	        		connection = Connector.Connect();
	        	Statement statement = connection.createStatement();
	        	String sql_query =  "UPDATE zamovl SET "
	        			        + "Project_ID='"+ Integer.parseInt(request.getParameter("Zamovl_ID"))+"', "
	        					+ "KodZamovl='"+ Integer.parseInt(request.getParameter("KodZamovl"))+"', "
	        					+ "DataRegZamovl='"+ request.getParameter("DataRegZamovl")+"', "
	        					+ "ObozZamov='"+ request.getParameter("ObozZamov")+"', "
	        					+ "NameZamovl='"+ request.getParameter("NameZamovl")+"', "
	        					+ "TypeZamovl='"+ request.getParameter("TypeZamovl")+"', "
	        					+ "DataStartZamovl='"+ request.getParameter("DataStartZamovl")+"', "
	        					+ "DataEndZamovl='"+ request.getParameter("DataEndZamovl")+"', "
	        					+ "SumOpl='"+ Integer.parseInt(request.getParameter("SumOpl"))+"', "
	        					+ "PrzOpl='"+ request.getParameter("PrzOpl")+"', "
	        					+ "StatusZam='"+ Integer.parseInt(request.getParameter("StatusZam"))+"', "
	        					+ "KodClient='"+ Integer.parseInt(request.getParameter("KodClient"))+"', "
	        					+ "Prioritet='"+ request.getParameter("Prioritet")+"', "
	        					+ "IdDepartIsp='"+ Integer.parseInt(request.getParameter("IdDepartIsp"))+"' "
	        					+ "WHERE Zamovl_ID='"+ Integer.parseInt(request.getParameter("Zamovl_ID"))+"'";
	        	 statement.executeUpdate(sql_query);
	        	    
	        	connection.close();
	        	} catch (ClassNotFoundException | SQLException e) {
	        	e.printStackTrace();
	        		}	
	        }
	        
	        public void editZamovlitemDeveloper(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        	
	        	 System.out.println("editZamovlitemDeveloper2");
	        	
	        		
	        	
	        	String sql_query =  "UPDATE zamovlitem SET "
	        			        + "IdProject='"+ Integer.parseInt(request.getParameter("IdProject"))+"', "
	        			        + "ObozZamov='"+ Integer.parseInt(request.getParameter("ObozZamov"))+"', "
	        					+ "OBZDSE='"+ request.getParameter("OBZDSE")+"', "
	        					+ "OBZIZD='"+ request.getParameter("OBZIZD")+"', "
	        					+ "NAMEIZ='"+ request.getParameter("NAMEIZ")+"', "
	        					+ "TIPZAVD='"+ request.getParameter("TIPZAVD")+"', "
	        					+ "PROIZVPROG='"+ Integer.parseInt(request.getParameter("PROIZVPROG"))+"', "
	        					+ "CEH_MAIN='"+ request.getParameter("CEH_MAIN")+"', "
	        					+ "RASCEH='"+ request.getParameter("RASCEH")+"', "
	        					+ "PRELICTDOC='"+ request.getParameter("PRELICTDOC")+"', "
	        					+ "PS='"+ request.getParameter("PS")+"', "
	        					+ "NOMZAMOVL='"+ Integer.parseInt(request.getParameter("NOMZAMOVL"))+"', "
	        					+ "asudetKod='"+ request.getParameter("asudetKod")+"' "
	        					+ "WHERE User_ID='"+ Integer.parseInt(request.getParameter("User_ID"))+"' ";
	        					
	        	String sql_query2 ="UPDATE ASUDET SET ASUDET.conect='"+Integer.parseInt(request.getParameter("User_ID"))+"'  WHERE ASUDET.AA11='"+request.getParameter("asudetKod")+"'"; 
	        	try  {
	        		Connection connection = Connector.Connect();
	        	    connection.setAutoCommit(false);
	        	    try (Statement stmt = connection.createStatement()) {
	        	        stmt.executeUpdate(sql_query);
	        	        stmt.executeUpdate(sql_query2);

	        	        connection.commit();
	        	    } catch (SQLException e) {
	        	        connection.rollback();
	        	        throw e;
	        	    }
	        	}
	        	catch (ClassNotFoundException | SQLException e) {
		        	e.printStackTrace();
		        		}
	        	
	        	String path = "/виробничы-замовлення.jsp";
	                ServletContext servletContext = getServletContext();
	                RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
	                requestDispatcher.forward(request, response);  
	        }
	        
	        public void createListWorkZam(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        	if(request.getParameter("radio1")!=null&&request.getParameter("radio2")!=null)
	        	{
	        		String sql_query="SELECT ObozZamov, OBZDSE, PROIZVPROG, CEH_MAIN, RASCEH, PRELICTDOC from zamovlitem WHERE zamovlitem.ObozZamov ='"+Integer.parseInt(request.getParameter("radio1"))+"'";
	        		// int int int int string string string
	        		String sql_query2="INSERT INTO listworkzam(Id_Ispoln, ObozZamov, OBZDSE, PROIZVPROG, CEH_MAIN, RASCEH, PRELICTDOC ) VALUES ";
	        		try  {
		        		Connection connection = Connector.Connect();
		        	    connection.setAutoCommit(false);
		        	    try (Statement stmt = connection.createStatement()) {
		        	    	  ResultSet rs = stmt.executeQuery(sql_query);
		        	    	  while(rs.next())
		        	    	  {
		        	    		  sql_query2+="('"+Integer.parseInt(request.getParameter("radio2"))+"', '"+rs.getInt(1)+"', '"+rs.getString(2)+"', '"+rs.getInt(3)+"', '"+rs.getString(4)+"', '"+rs.getString(5)+"', '"+rs.getString(6)+"'),";  
		        	    	  }
		        	    	  sql_query2 =sql_query2.substring(0, sql_query2.length()-1);
		        	        stmt.executeUpdate(sql_query2);

		        	        connection.commit();
		        	    } catch (SQLException e) {
		        	        connection.rollback();
		        	        throw e;
		        	    }
		        	}
		        	catch (ClassNotFoundException | SQLException e) {
			        	e.printStackTrace();
			        		}
	        	}
	        	
	        }
	        
            public void editListWorkZam(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            	Connection connection;
	        	 System.out.println("editlistworkzam2");
	        	try {
	        		connection = Connector.Connect();
	        	Statement statement = connection.createStatement();
	        	System.out.println(request.getParameter("4"));
	        	System.out.println(request.getParameter("10"));
	        	System.out.println(request.getParameter("20"));
	        	
	        	String sql_query =  "UPDATE listworkzam SET "
	        					+ "CEH='"+ Integer.parseInt(request.getParameter("2"))+"', "
	        					+ "ObozZamov='"+ request.getParameter("3")+"', "
	        					+ "OBZDSE='"+ request.getParameter("4")+"', "
	        					+ "NAMEDSE='"+ request.getParameter("5")+"', "
	        					+ "NOMIZD='"+ Integer.parseInt(request.getParameter("6"))+"', "
	        					+ "PROIZVPROG='"+ Integer.parseInt(request.getParameter("7"))+"', "
	        					+ "CEH_MAIN='"+ request.getParameter("8")+"', "
	        					+ "RASCEH='"+ request.getParameter("9")+"', "
	        					+ "PRELICTDOC='"+ request.getParameter("10")+"', "
	        					+ "NAMEWORK='"+ request.getParameter("11")+"', "
	        					+ "TYP_WORK='"+ request.getParameter("12")+"', "
	        					+ "IDZADZAM='"+ Integer.parseInt(request.getParameter("13"))+"', "
	        					+ "DateObrBeg='"+ request.getParameter("14")+"', "
	        							+ "DateObrEnd='"+ request.getParameter("15")+"', "
	        									+ "KOL_PL='"+ Integer.parseInt(request.getParameter("16"))+"', "
	        											+ "TRD_PL='"+ Integer.parseInt(request.getParameter("17"))+"', "
	        													+ "Ispoln='"+ request.getParameter("18")+"', "
	        															+ "Id_Ispoln='"+ Integer.parseInt(request.getParameter("19"))+"', "
	        																	+ "Prioritet='"+ request.getParameter("20")+"', "
	        																			+ "PriceWork='"+ Integer.parseInt(request.getParameter("21"))+"', "
	        																					+ "PrcGotovn='"+ Integer.parseInt(request.getParameter("22"))+"', "
	        																							+ "NOTES='"+ request.getParameter("23")+"' "
	        					+ "WHERE Zamovl_ID='"+ Integer.parseInt(request.getParameter("1"))+"'";
	        	 statement.executeUpdate(sql_query);
	        	    
	        	connection.close();
	        	} catch (ClassNotFoundException | SQLException e) {
	        	e.printStackTrace();
	        		}	
	        }
}
