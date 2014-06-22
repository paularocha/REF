package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edivandro
 */
public class MinhasReservasController {
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");

       if(SessaoController.isLoged(req, res)){
            String nomeArq = "conteudos/minhasReservasView.jsp";
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
