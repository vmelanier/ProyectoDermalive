<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
    
    <t:main>
        <jsp:attribute name="title">
            <title>Contacto</title>
        </jsp:attribute>
        <jsp:body>
    <br>
    <center>
<form action="/contact/nuevo/" method="post" class="form">
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
                <input type="submit" class="btn btn-primary" value="Suscribete">
            </div>
        </form>
     <center>
            <img src="/images/banner.png"/>
    </center>
</jsp:body>
</t:main>
