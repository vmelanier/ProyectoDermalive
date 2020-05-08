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
<link rel="stylesheet" href="/css/app.css">
<link rel="stylesheet" href="/css/EstilosContacto.css">
<link rel="stylesheet" href="/css/EstilosTienda.css">
<link rel="stylesheet" href="/css/EstilosConocenos.css">
<link rel="stylesheet" href="/css/EstilosMain.css">
<script src="/js/Reproductor.js"></script>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
                                    <li><a href="http://localhost:8080/Catalogo">Catálogo</a></li>
                                 </ul>
                             </nav>
</header>
    </center>
<body>
<jsp:doBody/>
</body>
<footer>
        <h4> Dermalive 2019 </h4>
        Administracion <a href="http://localhost:8080/admin/panel">Login</a>
</footer>