<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Datos de la pel�cula</h1>
	<ul>
		<li>T�tulo: <%=request.getParameter("titulo") %></li>
		<li>G�nero: <%=request.getParameter("genero") %></li>
		<li>Duraci�n: <%=request.getParameter("duracion") %></li>
		<li>Calificaci�n: <%=request.getParameter("calificacion") %></li>
		<li>
		<% String[] listaPremios = request.getParameterValues("premios[]");
			if (listaPremios==null || listaPremios.length==0) {
			out.print("No hay premios. </li>");
		} else {
			out.println("<ul>");
			for (String premio : listaPremios) {
				out.println("<li>"+premio+"</li>");
			}
			out.println("</ul>");
			out.println("</li>");
		} %>
		</li>
	</ul>
 

</body>
</html>