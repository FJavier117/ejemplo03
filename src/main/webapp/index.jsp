<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clase java</title>
</head>
<body>
<header>
    <h1>EJEMPLO 03</h1>
</header>
<br>
<section>
    <h1>Formulario de registro de viaje</h1>
    <form action="destino.jsp" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre"><br>
        <label for="minicial">Minuto inicial:</label>
        <input type="text" id="minicial" name="minicial"><br>
        <label for="mfinal">Minuto final:</label>
        <input type="text" id="mfinal" name="mfinal"><br>
        <label for="drecorrida">Distancia recorrida en metros:</label>
        <input type="text" id="drecorrida" name="drecorrida"><br>
        <input type="submit" name="Enviar">
        <input type="reset" name="Borrar">
    </form>
</section>
</body>
</html>