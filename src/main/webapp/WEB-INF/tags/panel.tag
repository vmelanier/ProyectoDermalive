<%@ tag description="Main layout" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<jsp:invoke fragment="title" />
<link rel="stylesheet" href="css/EstilosRostro.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<header>
    <center>
            
                             <img src="images/Logo.png" width="150" />
                           
    </center>
</header>
    
<body>
<jsp:doBody/>
</body>
<footer>
        <h4> Dermalive 2019 </h4>
</footer>

   <!-- <form action="/auth/logout" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input type="submit" class="button primary" value="Cerrar sesión">
            </form> -->