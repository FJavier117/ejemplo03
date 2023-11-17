<%--
  Created by IntelliJ IDEA.
  User: mende
  Date: 14/11/2023
  Time: 05:56 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calcular datos</title>
</head>
<body>

    <%--Importamos clases java--%>
    <%@ page import="com.fjavmvazquez.ejemplo03.model.service.Calcular" %>
    <%@ page import="com.fjavmvazquez.ejemplo03.model.ModelCalcular" %>

    <%--Scriptplet--%>
    <%
        String nombre = request.getParameter("nombre");
        String tInicial = request.getParameter("minicial");
        String tFinal = request.getParameter("mfinal");
        String distancia = request.getParameter("drecorrida");
        Double velocidad, tiempo;
        ModelCalcular modelCalcular = new ModelCalcular(tInicial,tFinal,distancia);
        //Inyectamos dependencia
        Calcular calcular = new Calcular(modelCalcular);
        calcular.velocidad();
        velocidad = modelCalcular.getVelocidad();
        calcular.tiempoTotal();
        tiempo = modelCalcular.gettTotal();
    %>


    <h2>Resultado final</h2>
    <p>Hola <%= nombre%> </p>
    <p>Tu tiempo total fue de: <%= tiempo%> </p>
    <p>Tu velocidad: <%= velocidad%> </p>

</body>
</html>
