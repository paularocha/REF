package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mocks.MockEspacoDAO;
import model.beans.EspacoBean;
import model.beans.EventoGoogleBean;
import model.beans.UsuarioBean;
import model.dao.EventoGoogleDAO;


public class EventoController// implements Controller 
{

//    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String espaco = req.getParameter("espaco");
        //String criador = req.getParameter("criador");

       
        if(SessaoController.isLoged(req, res)){
            //EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            //ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            String nomeArq = "conteudos/eventosView.jsp";
            //req.setAttribute("eventoGoogleDAO", eventoGoogleDAO);
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("espaco", espaco);
            
        }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            //return "/WEB-INF/views/homeView.jsp";
       }
        return "/WEB-INF/views/homeView.jsp";
    }
    
    public String verMeusEventos(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");
        UsuarioBean usuarioLogado = (UsuarioBean) req.getSession().getAttribute("usuarioLogado");
        
        String criador = usuarioLogado.getNome();

       if(SessaoController.isLoged(req, res)){
            EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            String nomeArq = "conteudos/eventosView.jsp";
            req.setAttribute("eventoGoogleDAO", ev);
            req.setAttribute("nomearq", nomeArq);
            
       }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            
       }
       return "/WEB-INF/views/homeView.jsp";
    }
    
    public String verEventosPendentes(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        if(SessaoController.isLoged(req, res)){
            String nomeArq = "conteudos/eventosPendentesView.jsp";
            req.setAttribute("nomearq", nomeArq);

            return "/WEB-INF/views/homeView.jsp";
        }else{
            String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            return "/WEB-INF/views/homeView.jsp";
       }
    }

}
