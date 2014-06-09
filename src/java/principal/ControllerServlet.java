package principal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logicas.Logica;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

        @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out = response.getWriter();

            String parametro = request.getParameter("log");
            if(parametro == null)
                parametro = "Home";
            System.out.println("param: " + parametro);
            String nomeDaClasse = "logicas." + parametro;

            try {
                Class<?> classe = Class.forName(nomeDaClasse);

                Logica logica = (Logica) classe.newInstance();
                String pagina = logica.executa(request, response);

                request.getRequestDispatcher(pagina).forward(request, response);

            } catch (Exception e) {
                throw new ServletException(
                  "A lógica de negócios causou uma exceção", e);
            }
    }
}