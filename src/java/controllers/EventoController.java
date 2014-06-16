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

       
        //MockEspacoDAO mock = new MockEspacoDAO();
        //ArrayList<EspacoBean> bd = mock.getBd();
        // Guarda a lista no request
        // req.setAttribute("contatos", contatos);
        
        String nomeArq = "conteudos/eventoView.jsp";
        req.setAttribute("nomearq", nomeArq);
        req.setAttribute("espaco", espaco);
        return "/WEB-INF/views/homeView.jsp";
    }

}
