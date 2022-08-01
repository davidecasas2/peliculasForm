<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Formulario de alta de pel�culas</h1>
    <form action="resumen.jsp" method="post">
        <div>
            <label for="titulo">T�tulo:</label>
            <input type="text" name="titulo" id="titulo">
        </div>

        <div>
            <label for="genero">G�nero:</label>
            <select name="genero" id="genero">
                <option value="1">Drama</option>
                <option value="2">Comedia</option>
                <option value="3">Acci�n</option>
                <option value="4">Terror</option>
                <option value="5">Ciencia Ficci�n</option>
            </select>
        </div>

        <div>
            <label for="duracion">Duraci�n: </label>
            <input type="time" name="duracion" id="duracion">
        </div>

        <div>
            <label for="calificacion">Calificaci�n:</label>
            <input type="number" name="calificacion" id="calificacion" 
                   value="3" min="1" max="5">
        </div>
        <div>
            <label>Premios</label>
            <input type="checkbox" name="premios[]" id="oscar" value="oscar">
            <label for="oscar">Oscar</label>
            <input type="checkbox" name="premios[]" id="goya" value="goya">
            <label for="goya">Goya</label>
            <input type="checkbox" name="premios[]" id="osoPlata" value="osoPlata" >
            <label for="osoPlata">Oso de Plata</label>
        </div>
        <input type="submit" value="Registrar">
        <input type="reset" value="Limpiar">
    </form>
 

</body>
</html>