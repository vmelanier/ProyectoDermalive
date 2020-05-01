<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/EstilosContacto.css">
    <header>
        <center>
            <div class="menu_bar">
                <a href="#" class="bt-menu">Menu</a>
            </div>
            <img src="/images/Logo.png" width="150" />
            <nav>
                <ul>
                    <li><a href="views">Inicio</a></li>
                    <li><a href="Conocenos">Conocenos</a></li>
                    <li><a href="Tienda">Tienda</a>
                    <li><a href="Contacto" class="current">Contacto</a></li>
                    <li><a href="Catalogo">Catálogo</a></li>
                </ul>
            </nav>  
          </center>
        </header>
<body>
    <br>
    <center>
<form action="/Contacto" method="post" class="form">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

            <div class="form-group">
                <label for="Contacto-title">Nombre:</label>
                <input type="text" name="title"
                    id="Contacto-title" class="form-control"
                    value="">
            </div>

            <div class="form-group">
                <label for="Contacto-title">Telefono:</label>
                <input type="tel" name="telefono"
                    id="Contacto-title" class="form-control"
                    value="">
            </div>

            <div class="form-group">
                <label for="Contacto-title">Correo:</label>
                <input type="email" name="email"
                    id="Contacto-title" class="form-control"
                    value="">
            </div>

            <div class="form-group text-center">
                <input type="submit" class="btn btn-primary" value="Crear nuevo contacto">
            </div>
        </form>
     <center>
            <img src="images/banner.png"/>
    </center>
</body>
<br>
<br>
<footer>
        <h4> Dermalive 2019 </h4>
</footer>