package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgendaController{

	//@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("Executando a logica e redirecionando...");
                String id = req.getParameter("id");
                
                String nomeArq = "conteudos/agendaView.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/homeView.jsp";
	}

}
