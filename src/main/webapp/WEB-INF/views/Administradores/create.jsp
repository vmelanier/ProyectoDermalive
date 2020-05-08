<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:panel>
    <jsp:attribute name="title">
        <title>Crear</title>
    </jsp:attribute>
    <jsp:body>
         <center>
        <spring:hasBindErrors name="catalogoForm">
            <div>
               <ul >
                   <c:forEach items="${errors.allErrors}" var="error">
                        <li>${error.defaultMessage}</li>
                </c:forEach>
               </ul>
            </div>
        </spring:hasBindErrors>

        <form method="post" action="/admin/panel">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <div >
                <div>
                    <input type="text" name="nombre_producto" id="nombre_producto" value="" placeholder="Nombre del Producto" /> 
                </div>
                <div>
                    <input type="number" name="precio" id="precio" value="" placeholder="Precio" /> 
                </div>
                <div>
                    <input type="text" name="sucursal" id="sucursal" value="" placeholder="Sucursal" /> 
                </div>
                <div>
                    <input type="text" name="imagen_url" id="imagen_url" value="" placeholder="URL de la imagen" /> 
                </div>
                <div>
                    <input type="submit" value="Resgistrar Producto" class="primary" />
                </div>
            </div>

        </form>

    </center>
    </jsp:body>
</t:panel>