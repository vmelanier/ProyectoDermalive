<%@ tag description="Main layout" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<jsp:invoke fragment="title" />
<link rel="stylesheet" href="/css/EstilosRostro.css">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<header>

    <center>
                             </div>
                             <img src="/images/Logo.png" width="150" />
                             <nav>
                                 <ul>
                                    <li><a href="http://localhost:8080/">Inicio</a></li>
                                    <li><a href="http://localhost:8080/Conocenos">Conocenos</a></li>
                                    <li><a href="http://localhost:8080/Tienda">Tienda</a></li>
                                    <li><a href="http://localhost:8080/contact/nuevo/index">Contacto</a></li>
                                    <li><a href="http://localhost:8080/Catalago">Catálogo</a></li>
                                    <li><a href="http://localhost:8080/admin/panel/crear">Crear</a></li>
                                    <li><form action="/auth/logout" method="post">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    <input type="submit" value="Cerrar sesión">
                    </form></li>
                                 </ul>
                             </nav>
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