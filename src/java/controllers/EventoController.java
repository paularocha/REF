package controllers;

import model.beans.EspacoBean;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mocks.MockEspacoDAO;


public class EventoController// implements Controller 
{

//    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String espaco = req.getParameter("espaco");

       
        if(SessaoController.isLoged(req, res)){
            String nomeArq = "conteudos/eventoView.jsp";
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
