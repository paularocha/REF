package principal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mocks.MockUsuarioDAO;
import model.beans.UsuarioBean;
import model.dao.UsuarioDAO;

public class Sessao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession sessao = request.getSession(true);
            String ac = request.getParameter("ac");
            
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            if(ac.equals("logar")){
                MockUsuarioDAO usuarioDAO = new MockUsuarioDAO();
                if(usuarioDAO.existeUsuario(login,senha)) {
                    UsuarioBean usuario = usuarioDAO.getUsuario(login,senha);
                    
                    sessao.setAttribute("usuarioLogado", usuario);

                    //response.sendRedirect("");  
                //    request.getRequestDispatcher("/WEB-INF/views/homeView.jsp").forward(request, response);
                }else{
                    request.setAttribute("errado","true");
                }
            }else{
                sessao.invalidate();
                
            }
            String nomeArq = "conteudos/saudacaoView.jsp";
            request.setAttribute("nomearq", nomeArq);
            //response.sendRedirect("");

            request.getRequestDispatcher("/WEB-INF/views/homeView.jsp").forward(request, response);
            //response.sendRedirect("");  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
