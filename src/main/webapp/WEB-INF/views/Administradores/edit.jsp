<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:panel>
    <jsp:attribute name="title">
        <title>Editar</title>
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

        Id del producto:  <span ><strong>${catalogo.getId_producto()}</strong></span>    
        <form method="post" action="/admin/panel/${catalogo.getId_producto()}">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <div >
                <div>
                    <input type="text" name="nombre_producto" id="nombre_producto"  placeholder="Nombre del Producto" value="${catalogo.getNombre_producto()}"/>
                </div>
                <div>
                    <input type="number" name="precio" id="precio"  placeholder="Precio" value="${catalogo.getPrecio()}"/> 
                </div>
                <div>
                    <input type="text" name="sucursal" id="sucursal"  placeholder="Sucursal" value="${catalogo.getSucursal()}"/> 
                </div>
                <div>
                    <input type="text" name="imagen_url" id="imagen_url"  placeholder="URL de la imagen" value="${catalogo.getImagen_url()}"/> 
                </div>
                <div>
                    <input type="submit" value="Registrar Producto"  />
                </div>
            </div>

        </form>
    </center>
    </jsp:body>
</t:panel>