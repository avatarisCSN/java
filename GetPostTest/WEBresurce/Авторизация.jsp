<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Mountain, Latest Travel News, Photo Gallery, Photo Tours, Master Photo Tour, INTUITIVE">
    <meta name="description" content="">
    <title>Авторизация</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="Авторизация.css" media="screen">
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
    <meta property="og:title" content="Авторизация">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-9db7"><div class="u-clearfix u-sheet u-sheet-1">
        <p>LOGO<p>
         
        
        <nav class="u-align-center u-menu u-menu-dropdown u-offcanvas u-menu-1" data-position="Главное">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
         
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
               
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <a class="u-login u-login-1">Імя користувача</a>
      </div></header>
    <section class="u-clearfix u-gradient u-section-1" id="carousel_cdc5">
      <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <div class="u-clearfix u-expanded-width u-layout-wrap u-layout-wrap-1">
          <div class="u-layout">
            <div class="u-layout-row">
              <div class="u-container-style u-layout-cell u-size-60 u-layout-cell-1">
                <div class="u-container-layout u-valign-top u-container-layout-1">
                  <div class="u-align-center u-container-style u-expanded-width u-group u-radius-30 u-shape-round u-white u-group-1">
                    <div class="u-container-layout u-container-layout-2">
                      <p class="u-large-text u-text u-text-variant u-text-1">Авторизація</p>
                      <p class="u-text u-text-2">Увійдіть до аккаунта</p>
                      <div class="u-form u-form-1">

         
                       <form action="${pageContext.request.contextPath}/UserServlet?type=login" method="post">

                          <div class="u-form-group u-form-name">
                            <label for="name-4c18" class="u-label">Логин</label>
                            <input type="text" placeholder="Введите логин" id="name-4c18"  name="name" class="u-border-2 u-border-grey-5 u-grey-5 u-input u-input-rectangle u-radius-10" required="">
                          </div>
                          <div class="u-form-email u-form-group">
                            <label for="email-4c18" class="u-label">Пароль</label>
                            <input type="password" placeholder="Введите пароль" id="email-4c18" name="password" class="u-border-2 u-border-grey-5 u-grey-5 u-input u-input-rectangle u-radius-10" required="">
                          </div>
                          <div class="u-align-right u-form-group u-form-submit">
                           
                            <input class="u-align-center u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-2"  type="submit" value="Вхід" >
                          </div>
                       
                        </form>
                      </div>
                      <p class="u-text u-text-3">Немає аккаунту?</p>
                      <a href="https://nicepage.com/k/adult-website-templates" class="u-align-center u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-2">Регистрація</a>
                    </div>
                  </div>
                </div>
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
      <a class="u-link" href="https://nicepage.com/website-design" target="_blank">
        <span>Website Design</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/html-website-builder" target="_blank">
        <span>HTML Builder</span>
      </a>. 
    </section>
  </body>
</html>