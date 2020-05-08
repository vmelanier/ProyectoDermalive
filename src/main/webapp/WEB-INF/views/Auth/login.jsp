<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:panel>
    <jsp:attribute name="title">
        <title>Login</title>
    </jsp:attribute>
    <jsp:body>

<c:if test="${errorMessage != null && !errorMessage.isEmpty()}">
            <div class="alert alert-danger ">
                ${errorMessage}
            </div>
        </c:if>
        <br>
        <br>
        <br>
            <form method="post" >
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
<center>
                <div >
                    <label for="username">Username:</label>
                    <input type="text" name="username"
                        id="username">
                </div>
<br>
                <div >
                    <label for="password">Contraseña:</label>
                    <input type="password" name="password"
                        id="password" >
                </div>
                <br>
                <br>

                <input type="submit" class="btn btn-primary btn-block" value="Iniciar sesión" style='width:200px'>
            </form>
        </center>
        </jsp:body>
    </t:panel>