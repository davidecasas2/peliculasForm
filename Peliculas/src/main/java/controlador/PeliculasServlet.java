package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PeliculasServlet
 */
@WebServlet("/registrarPelicula")
public class PeliculasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeliculasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String titulo = request.getParameter("titulo");
		String genero = request.getParameter("genero");
		String duracion = request.getParameter("duracion");
		Integer calificacion = Integer.parseInt(request.getParameter("calificacion"));
		String[] listaPremios = request.getParameterValues("premios[]"); 
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
		out.println("<h1> Resumen de la película</h1>");
		out.println("<ul>");
		out.println("<li> Título: "+titulo+"</li>");
		out.println("<li> Género: "+genero+"</li>");
		out.println("<li> Duración: "+duracion+"</li>");
		out.println("<li> Calificacion: "+calificacion+"</li>");
		out.println("<li> Premios: ");
		if (listaPremios==null || listaPremios.length==0) {
			out.print("No hay premios. </li>");
		} else {
			out.println("<ul>");
			for (String premio : listaPremios) {
				out.println("<li>"+premio+"</li>");
			}
			out.println("</ul>");
			out.println("</li>");
		}
		out.println("</body>\r\n"
				+ "</html>");
	}

}
