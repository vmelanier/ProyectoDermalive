<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<%
     String greeting = (String) request.getAttribute("var1");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1><%= greeting %></h1>
</body>
</html>