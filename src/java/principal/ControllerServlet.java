package principal;


import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

       String action = request.getParameter("ac");
       String controller = request.getParameter("log");

       if(controller == null)
           controller = "Home";
       if(action == null)
           action = "executa";

       System.out.println("Controlador: " + controller);

       String nomeDaClasse = "controllers." + controller + "Controller";

       try {
           Class<?> classe = Class.forName(nomeDaClasse);

           Method met = classe.getMethod(action, new Class[]{HttpServletRequest.class, HttpServletResponse.class});
           System.out.println("metodo = " + met.getName());

           Object logica =  classe.newInstance();
           String pagina = (String)met.invoke(logica,new Object[]{request, response});
           //String pagina = logica.executa(request, response);

           request.getRequestDispatcher(pagina).forward(request, response);
         
       } catch (Exception e) {
           throw new ServletException(
             "A lógica de negócios causou uma exceção", e);
       }
    }
}