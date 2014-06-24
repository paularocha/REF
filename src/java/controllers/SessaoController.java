package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mocks.MockUsuarioDAO;
import model.beans.UsuarioBean;
import model.dao.UsuarioDAO;

public class SessaoController {
    public String efetuarLogin(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession sessao = request.getSession(true);
        String ac = request.getParameter("ac");

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        MockUsuarioDAO usuarioDAO = new MockUsuarioDAO();
        if(usuarioDAO.existeUsuario(login,senha)) {
            UsuarioBean usuario = usuarioDAO.getUsuario(login,senha);

            sessao.setAttribute("usuarioLogado", usuario);

            //response.sendRedirect("");  
        //    request.getRequestDispatcher("/WEB-INF/views/homeView.jsp").forward(request, response);
        }else{
            request.setAttribute("errado","true");
        }



            
            String nomeArq = "conteudos/saudacaoView.jsp";
            request.setAttribute("nomearq", nomeArq);
        return "/WEB-INF/views/homeView.jsp";
  }
    
    public String efetuarLogout(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession sessao = request.getSession();
        sessao.invalidate();
        
        String nomeArq = "conteudos/saudacaoView.jsp";
        request.setAttribute("nomearq", nomeArq);        
        return "/WEB-INF/views/homeView.jsp";
    }
    
    public static boolean isLoged(HttpServletRequest request, HttpServletResponse response){
        HttpSession sessao = request.getSession();
        UsuarioBean usuarioLogado = (UsuarioBean) sessao.getAttribute("usuarioLogado");
        return (usuarioLogado != null);
    }
    
    public static UsuarioBean getUserLoged(HttpServletRequest request, HttpServletResponse response){
        HttpSession sessao = request.getSession();
        UsuarioBean usuarioLogado = (UsuarioBean) sessao.getAttribute("usuarioLogado");
        return usuarioLogado;
    }
}
