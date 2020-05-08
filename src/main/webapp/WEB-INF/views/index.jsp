<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
    
    <t:main>
        <jsp:attribute name="title">
            <title>Inicio</title>
        </jsp:attribute>
        <jsp:body>
    
    <section id=reproductor>
        <video id="medio" width="820" height="500">
            <source src="/js/VideoDermaLive.mp4" type="video/mp4">
        </video>
        <nav>
            <div id="botones">
                <button type="button" id="reproducir">Reproducir</button>
            </div>
            <div id="barra">
                <div id="progreso"></div>
            </div>
            <div style="clear: both"></div>
        </nav>
    </section>
  <br>
      <h1>Productos mas vendidos</h1>  
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
        </ol>
        <div class="carousel-inner" align="center">
          <div class="carousel-item active">
            <img src="images/Producto1.png" class="d-block w-10" >
            <h2>Skin Detox</h2>
          </div>
          <div class="carousel-item" align="center">
            <img src="images/Producto2.png" class="d-block w-10">
            <h2>Hydro Boost</h2>
          </div>
          <div class="carousel-item" align="center">
            <img src="images/Producto3.png" class="d-block w-30">
            <h2>Clearing</h2>
          </div>
          <div class="carousel-item" align="center">
                <img src="images/Producto4.png" class="d-block w-30">
                <h2>Mascarillas faciales</h2>
              </div>
        </div>
        <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
<center>
    <img src="images/Recomendaciones.jpeg" width="900"/>
</center>
<br>
 </div>
 <script src="/js/app.js"></script>

</jsp:body>
</t:main>