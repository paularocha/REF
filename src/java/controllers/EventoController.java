package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mocks.MockEspacoDAO;
import model.beans.EspacoBean;
import model.beans.EventoGoogleBean;
import model.dao.EventoGoogleDAO;


public class EventoController// implements Controller 
{

//    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String espaco = req.getParameter("espaco");
        String criador = req.getParameter("criador");

       
        if(SessaoController.isLoged(req, res)){
            EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            String nomeArq = "conteudos/eventoView.jsp";
            req.setAttribute("eventoGoogleDAO", ev);
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("espaco", espaco);
            return "/WEB-INF/views/homeView.jsp";
        }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            return "/WEB-INF/views/homeView.jsp";
       }
        
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
