<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:panel>
    <jsp:attribute name="title">
        <title>Editar</title>
    </jsp:attribute>
    <jsp:body>
         
        <spring:hasBindErrors name="catalogoForm">
            <div>
               <ul >
                   <c:forEach items="${errors.allErrors}" var="error">
                        <li>${error.defaultMessage}</li>
                </c:forEach>
               </ul>
            </div>
        </spring:hasBindErrors>

        Id del producto:  <span ><strong>${catalogo.getIdProducto()}</strong></span>    
        <form method="post" action="/admin/panel/${catalogo.getIdProducto()}">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <div >
                <div>
                    <input type="text" name="nombreProducto" id="nombreProducto" value="" placeholder="Nombre del Producto" value="${catalogo.getNombreProducto()"}/> 
                </div>
                <div>
                    <input type="number" name="precio" id="precio" value="" placeholder="Precio" value="${catalogo.getgetPrecio()"}/> 
                </div>
                <div>
                    <input type="text" name="sucursal" id="sucursal" value="" placeholder="Sucursal" value="${catalogo.getgetSucursal()"}/> 
                </div>
                <div>
                    <input type="text" name="imagenUrl" id="imagenUrl" value="" placeholder="URL de la imagen" value="${catalogo.getgetImagenUrl()"}/> 
                </div>
                <div>
                    <input type="submit" value="Resgistrar Producto"  />
                </div>
            </div>

        </form>
    </jsp:body>
</t:panel>