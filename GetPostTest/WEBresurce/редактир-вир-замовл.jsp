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
    <title>редактир вир замовл</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="редактир-вир-замовл.css" media="screen">
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
    <meta property="og:title" content="редактир вир замовл">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-9db7"><div class="u-clearfix u-sheet u-sheet-1">
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
            <ul class="u-nav u-unstyled u-nav-1">
              <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="виробничы-замовлення.html" style="padding: 10px 20px;">виробничі-замовлення</a>
              </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="список-виконавцев.html" style="padding: 10px 20px;">список-виконавцев</a>
              </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="редактир-вир-замовл.html" style="padding: 10px 20px;">редагувати-вир-замовл</a>
              </li>
            </ul> 
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
        <form action="${pageContext.request.contextPath}/UserServlet?type=editListWorkZam" id="myform" method="post">
        <h4 class="u-text u-text-default u-text-1">Редагуйте виробничий заказ</h4>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
          <table class="u-table-entity u-table-entity-1">
            <colgroup>
              <col width="50%">
              <col width="50%">
            </colgroup>
            <thead class="u-palette-4-base u-table-header u-table-header-1">
              <tr style="height: 46px;">
                <th class="u-border-1 u-border-palette-4-base u-table-cell">редагуйте вир замовл</th>
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
                int a = Integer.parseInt(request.getParameter("radio3"));
                System.out.println(a);
               
               
                  sql_query =  "SELECT * FROM голубов_диплом.listworkzam where listworkzam.Zamovl_ID= '"+a+"'" ;
                
                ResultSet rs = statement.executeQuery(sql_query);
                while (rs.next()) {
                %>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Ідентіфікатор</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="1" type="text" value="<%= rs.getInt(1)%>" /></td>
              </tr>
              <tr style="height: 58px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-5">Цех</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="2" type="text" value="<%= rs.getInt(2)%>" /></td>
              </tr>
              <tr style="height: 58px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-7">ЗАМОВЛЕННЯ (Позначення)</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="3" type="text" value="<%= rs.getString(3)%>" /></td>
              </tr>
              <tr style="height: 58px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-9">Найменування деталі (вузла)</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="4" type="text" value="<%= rs.getString(4)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Позначення деталі (вузла)</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="5" type="text" value="<%= rs.getString(5)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Шифр виробу</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="6" type="text" value="<%= rs.getInt(6)%>"/></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Виробнича програма</td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="7" type="text" value="<%= rs.getInt(7)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Головний цех </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="8" type="text" value="<%= rs.getString(8)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Расцеховка </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="9" type="text" value="<%= rs.getString(9)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Перелік ТД </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="10" type="text" value="<%= rs.getString(10)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Найменування      операції </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="11" type="text" value="<%= rs.getString(11)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Тип операції </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="12" type="text" value="<%= rs.getString(12)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Іденіфікатор завдання замовлення </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="13" type="text" value="<%= rs.getInt(13)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Дата начала обработки </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="14" type="text" value="<%= rs.getString(14)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Дата кінця обробки </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="15" type="text"  value="<%= rs.getString(15)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Кількість план </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="16" type="text"  value="<%= rs.getInt(16)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Трудомісткість план </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="17" type="text" value="<%= rs.getInt(17)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Прізвище Ім'я По батькові виконавця </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="18" type="text" value="<%= rs.getString(18)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Код виконавця </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="19" type="text" value="<%= rs.getInt(19)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Приоритет </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="20" type="text" value="<%= rs.getString(20)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Стоимость роботи </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="21" type="text" value="<%= rs.getInt(21)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Розрахунковий відсоток готовності </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="22" type="text" value="<%= rs.getInt(22)%>" /></td>
              </tr>
              <tr style="height: 57px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-3">Примітка </td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><input form="myform" name="23" type="text" value="<%= rs.getString(23)%>" /></td>
              </tr>
<% 
	     }
	connection.close();
	
	} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
		}	%>
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