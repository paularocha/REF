package controllers;

import model.beans.EspacoBean;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mocks.MockEspacoDAO;


public class EspacoController{


    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");

       if(SessaoController.isLoged(req, res)){
            MockEspacoDAO mockEspacoDAO = new MockEspacoDAO();
            //ArrayList<EspacoBean> mockEspacoDAO = mock.getBd();
            // Guarda a lista no request
            // req.setAttribute("contatos", contatos);

            String nomeArq = "conteudos/espacosView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("mockEspacoDAO", mockEspacoDAO);
            return "/WEB-INF/views/homeView.jsp";
       }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("popup","voce precisa entrar novamente!!" );
            return "/WEB-INF/views/homeView.jsp";
       }
    }
}
