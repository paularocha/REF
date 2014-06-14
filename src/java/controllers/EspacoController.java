package controllers;

import model.beans.EspacoBean;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import testemvc.MockEspacoDAO;


public class EspacoController implements Controller {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");

       
        MockEspacoDAO mock = new MockEspacoDAO();
        ArrayList<EspacoBean> bd = mock.getBd();
        // Guarda a lista no request
        // req.setAttribute("contatos", contatos);
        
        String nomeArq = "conteudos/espacos.jsp";
        req.setAttribute("nomearq", nomeArq);
        req.setAttribute("bd", bd);
        return "/WEB-INF/views/home.jsp";
    }

}
