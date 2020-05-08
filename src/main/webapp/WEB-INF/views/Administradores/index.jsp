<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:panel>
    <jsp:attribute name="title">
        <title>Panel</title>
    </jsp:attribute>
    <jsp:body>

        <div >
            <c:if test="${successMessage != null && !successMessage.isEmpty()}">
                <div >
                    ${successMessage}
                </div>
            </c:if>
        </div>
         <br>
         <br>
         <br>
        <center>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Sucursal</th>
                    <th>Accion</th>
                
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${catalogo}" var="catalogo">
                    <tr>
                        <th>
                            ${catalogo.getId_producto()}
                        </th>
                        <th>
                            <em>${catalogo.getNombre_producto()}</em>
                        </th>
                        <th>
                            <em>${catalogo.getPrecio()}</em>
                        </th>
                        <th>
                            <em>${catalogo.getSucursal()}</em>
                        </th>
                        <th>
                            <a href="/admin/panel/${catalogo.getId_producto()}" >Editar</a>
                        </th>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </center>
    </jsp:body>
</t:panel>