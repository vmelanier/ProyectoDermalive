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
            <div class="menu_bar">
                                 <a href="#" class="bt-menu"></a>
                             </div>
                             <img src="images/Logo.png" width="150" />
                             <nav>
                                 <ul>
                                    <li><a href="views">Inicio</a></li>
                                    <li><a href="Conocenos">Conocenos</a></li>
                                    <li><a href="Tienda">Sucursales</a></li>
                                    <li><a href="Contacto">Contacto</a></li>
                                    <li><a href="Catalogo"class="current">Catálogo</a></li>
                                 </ul>
                             </nav>
</header>
    </center>
<body>
<jsp:doBody/>
</body>
<footer>
        <h4> Dermalive 2019 </h4>
</footer>