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
        <title>опис деталі</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
    <link rel="stylesheet" href="перелик-заказов.css" media="screen">
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
        <meta property="og:title" content="перелик заказов">
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
        <section class="u-align-center u-clearfix u-section-1" id="sec-7f86">
          <div class="u-clearfix u-sheet u-sheet-1">
            <div class="u-table u-table-responsive u-table-1">
              <table class="u-table-entity u-table-entity-1">
                <colgroup>
                  <col width="6.55%">
                  <col width="6.55%">
                  <col width="6.55%">
                  <col width="6.55%">
                  <col width="6.55%">
                  <col width="5.94%">
                  <col width="7.16%">
                  <col width="6.29%">
                  <col width="6.55%">
                  <col width="6.81%">
                  <col width="6.46%">
                  <col width="6.99%">
                  <col width="6.46%">
                  <col width="7.07%">
                  <col width="7.51%">
                </colgroup>
                <thead class="u-palette-4-base u-table-header u-table-header-1">
                  <tr style="height: 21px;">
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Позначення деталі (вузлів)</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Найменування деталі (вузлів)  </th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Код ЄСКД  </th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Номер ВВД </th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Маса деталі</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Найменування, познач.  матер.</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Код матеріалу</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Найменування, познач. заготівлі.</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Номер цеху</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Connect</th>
                  </tr>
                </thead>
                <tbody class="u-table-body">
                  <%
Connection connection;
  try {
            	 connection = Connector.Connect();
             Statement statement = connection.createStatement();
             String sql_query =  "SELECT * FROM голубов_диплом.ASUDET";
             if (request.getParameter("radio1")!=null)
             {
            	 sql_query =  "SELECT * FROM голубов_диплом.ASUDET WHERE ASUDET.conect = '"+Integer.parseInt(request.getParameter("radio1"))+"'";
             }
             ResultSet rs = statement.executeQuery(sql_query);
             while (rs.next()) {
            	 %>
                  <tr style="height: 30px;">
                    <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-16"><%=rs.getString(1)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getString(2)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getString(3)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getInt(4)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getInt(5)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getString(6)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getInt(7)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getString(8)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getInt(9)%></td>
                    <td class="u-border-1 u-border-grey-30 u-table-cell"><%=rs.getInt(16)%></td>
                   
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
            <div class="u-list u-list-1">
              <div class="u-repeater u-repeater-1">
                <div class="u-container-style u-list-item u-repeater-item">
                  <div class="u-container-layout u-similar-container u-container-layout-1">
                    <a href="https://nicepage.one" class="u-btn u-btn-round u-button-style u-custom-item u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-1">редагувати</a>
                  </div>
                </div>
                <div class="u-container-style u-list-item u-repeater-item">
                  <div class="u-container-layout u-similar-container u-container-layout-2">
                    <a href="https://nicepage.studio" class="u-btn u-btn-round u-button-style u-custom-item u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-2">додати</a>
                  </div>
                </div>
                <div class="u-container-style u-list-item u-repeater-item">
                  <div class="u-container-layout u-similar-container u-container-layout-3">
                    <a href="https://nicepage.studio" class="u-btn u-btn-round u-button-style u-custom-item u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-3">вихід</a>
                  </div>
                </div>
              </div>
            </div>
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
          <a class="u-link" href="https://nicepage.com/html-website-builder" target="_blank">
            <span>HTML Website Builder</span>
          </a>. 
        </section>
      </body>
    </html>