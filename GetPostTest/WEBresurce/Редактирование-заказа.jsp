<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

    <%@ page import="java.util.*, java.text.*, java.sql.Connection, java.sql.ResultSet, java.sql.SQLException, java.sql.Statement, src.Connector" %>
    

    
    
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title>Редактирование заказа</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="Редактирование-заказа.css" media="screen">
    <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 4.11.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "images/default-logo.png"
}</script>
    <meta name="theme-color" content="#478ac9">
    <meta property="og:title" content="Редактирование заказа">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-9db7"><div class="u-clearfix u-sheet u-sheet-1">
    <form action="${pageContext.request.contextPath}/UserServlet?type=editZamovlDeveloper" id="myform" method="post">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1">
          <img src="images/default-logo.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-align-center u-menu u-menu-dropdown u-offcanvas u-menu-1" data-position="Главное">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Управление-тех-заказами.html" style="padding: 10px 20px;">Замовлення на ТВП</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Список-заданий-заказа.html" style="padding: 10px 20px;">Замовлення</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Редактирование-заказа.html" style="padding: 10px 20px;">Редагування замовлення на ТВП</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Редактирование-единицы-заказа.html" style="padding: 10px 20px;">Редагування замовлення</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="редактирование-описа-детали.html" style="padding: 10px 20px;">опис деталі</a>
            </li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
               
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <a class="u-login u-login-1">Імя користувача</a>
      </div></header>
    <section class="u-align-center u-clearfix u-section-1" id="sec-4d30">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h4 class="u-text u-text-default u-text-1">Редагуйте замовлення</h4>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
          <table class="u-table-entity u-table-entity-1">
            <colgroup>
              <col width="50%">
              <col width="50%">
            </colgroup>
            <thead class="u-palette-4-base u-table-header u-table-header-1">
              <tr style="height: 46px;">
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Атрибут</th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Значення</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
       <% 
              
    
    Connection connection;
    
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
	try {
		connection = Connector.Connect();
       
	Statement statement = connection.createStatement();
	String sql_query="";
	int a=Integer.parseInt(request.getParameter("radio1"));
	System.out.println(a);
	
	if(request.getParameter("radio1")!="null")
	{
	 sql_query =  "Select * from zamovl where zamovl.Zamovl_ID= '"+a+"'" ;
	}
	ResultSet rs = statement.executeQuery(sql_query);
	while (rs.next()) {
    %>
    <tr style="height: 57px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Код замовлення  </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="Zamovl_ID" type="text" value="<%= rs.getInt(1)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-5">Ідентіфікатор проекту</td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="Project_ID" type="text" value="<%= rs.getInt(2)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-7">Номер замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="KodZamovl" type="text" value="<%= rs.getInt(3)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Дата замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="DataRegZamovl" type="text" value="<%= rs.getString(4)%>" /></td>
    </tr>
      <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Позначення замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="ObozZamov" type="text" value="<%= rs.getString(5)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Назва замовлення  </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="NameZamovl" type="text" value="<%= rs.getString(6)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Тип замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="TypeZamovl" type="text" value="<%= rs.getString(7)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Дата початка виконання замовлення</td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="DataStartZamovl" type="text" value="<%= rs.getString(8)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Дата закінчення виконання замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="DataEndZamovl" type="text" value="<%= rs.getString(9)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Всього до оплати  </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="SumOpl" type="text" value="<%= rs.getInt(10)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Признак оплати </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="PrzOpl" type="text" value="<%= rs.getString(11)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Статус замовлення </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="StatusZam" type="text" value="<%= rs.getInt(12)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Код клієнта  </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="KodClient" type="text" value="<%= rs.getInt(13)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Приоритет </td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="Prioritet" type="text" value="<%= rs.getString(14)%>" /></td>
    </tr>
    <tr style="height: 58px;">
      <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Ідентіфікатор підрозділа виконавця</td>
      <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="IdDepartIsp" type="text" value="<%= rs.getInt(15)%>" /></td>
    </tr>
    <%
	      
	     }
	connection.close();
	
	} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
		}	
    %>
             
            </tbody>
          </table>
        </div>
        <input form="myform"  class="u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-1" name="btn1" type="submit" value="Зберегти ">
        <a href="https://nicepage.dev" class="u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-2">Вийти</a>
      </form>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-2f22"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Пример текста. Кликните, чтобы выбрать элемент "Текст".</p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/website-templates" target="_blank">
        <span>Website Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="" target="_blank">
        <span>Website Builder Software</span>
      </a>. 
    </section>
  </body>
</html>