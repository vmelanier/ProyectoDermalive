<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:main>
    <jsp:attribute name="title">
        <title>Catalogo</title>
    </jsp:attribute>
    <jsp:body>


            <div class="galeria">
                <h1>Productos </h1>
                <div class="linea"></div>
                <div class="contenedor-imagenes">
            <c:forEach items="${catalogo}" var="catalogo">
                <div class="imagen">
                    <img src="${catalogo.getImagen_url()}" >
                    <div class="overlay">
                            <h2>Disponible en: ${catalogo.getSucursal()} , Precio: $ ${catalogo.getPrecio()}</h2>
                    </div>
            </div></c:forEach>
                    </div>
            </div>

</jsp:body>
</t:main>